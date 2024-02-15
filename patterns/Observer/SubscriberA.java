import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

class SubscriberA extends Thread implements PropertyChangeListener {

    public SubscriberA(Topic topic) {
        topic.addPropertyChangeListener(this);
    }

    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println("Received from subject - " + evt.getNewValue());
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("SubscriberA working.... ");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}