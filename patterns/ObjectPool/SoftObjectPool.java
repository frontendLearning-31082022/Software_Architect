import java.lang.ref.SoftReference;
import java.util.ArrayList;

interface CreationIF { //Создание объекта реализуется конкретным классом
    Object create();
}

class SoftObjectPool {

    private ArrayList pool; //объекты ожидающие повторного использования
    private CreationIF creator; // ответственнен за создания pool объектов

    private int instanceCount; //кол-во управляемых pool'ом объектов в данный момент
    private int maxInstances; //макс колво, если превышено ждет возвращения объекта обратно в пул

    private Class poolClass; //класс для создания объектов пула и проверок

    public SoftObjectPool(Class poolClass, CreationIF creator, int maxInstances) {
        this.creator = creator;
        this.poolClass = poolClass;
        this.maxInstances = maxInstances;
    }

    Object popObject() { //изъятие из пула
        if (pool.size() == 0) return null;

        SoftReference ref = (SoftReference) pool.remove(pool.size() - 1);
        instanceCount--;
        return ref.get();
    }

    Object getObject() {
        synchronized (pool) {
            Object obj = popObject();
            if (obj != null) return obj;

            if (instanceCount < maxInstances) return createObject();

            return null;
        }
    }

    Object getObjectWait() throws InterruptedException {
        Object waitObj = null;
        while (waitObj == null) {
            waitObj = this.getObject();
            if (waitObj != null) return waitObj;
            pool.wait();
        }
        return null;
    }

    private Object createObject() {
        instanceCount++;
        return creator.create();
    }

    public void release(Object obj) { //возвратить обратно в pool объект
        synchronized (pool) {
            pool.add(obj);
            pool.notify();
        }
    }

}

