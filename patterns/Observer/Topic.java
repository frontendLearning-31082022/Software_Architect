import java.beans.PropertyChangeListener;

public interface Topic {
    void addPropertyChangeListener(PropertyChangeListener listener);
    void removePropertyChangeListener(PropertyChangeListener listener);
}
