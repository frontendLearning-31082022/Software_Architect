package org.example.increaser;

import org.example.IncreaserMemento;

import java.util.Date;

public class Increazer {
    private int curVal=0;

    public Increazer(){}

    public int increase(){
        this.curVal++;
        return this.curVal;
    }


    public IncreaserMemento createMemento(String name){
        return new Memento(this.curVal,name);
    }
    public void restoreMemento(IncreaserMemento memento){
        ((Memento)memento).restore(this);
    }

    private class Memento implements IncreaserMemento {
        int curVal;


        private String name;
        private Date date;
        Memento(int curval,String name){
            this.curVal=curval;

            this.name=name;
            this.date=new Date();
        }


        //засериализованные версии сами могут развернутся при прослойках-интерфейсах. В условиях изменения класса может менятся алгоритм
        void restore(Increazer increazer){
            increazer.curVal=this.curVal;
        }



        @Override
        public String getName() {
            return this.name;
        }

        @Override
        public Date getDate() {
            return this.date;
        }
    }

}
