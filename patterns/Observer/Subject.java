import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Subject extends Thread implements Topic{
    private PropertyChangeSupport changes = new PropertyChangeSupport(this);
    private int counter = 0;

    public void sendMsgs()
    {
            changes.firePropertyChange("counter", counter, ++counter);
    }


    public void addPropertyChangeListener(PropertyChangeListener l) {
        changes.addPropertyChangeListener(l);
    }

    public void removePropertyChangeListener(PropertyChangeListener l) {
        changes.removePropertyChangeListener(l);
    }

    @Override
    public void run() {
        while (true){
            System.out.println("Subject Thread working....");
            this.sendMsgs();
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

