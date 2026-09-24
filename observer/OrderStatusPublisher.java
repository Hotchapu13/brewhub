import java.util.*;

public class OrderStatusPublisher implements Subject{
    private List<Observer> observers;
    private boolean queued;
    private boolean brewing;
    private boolean ready;

    public OrderStatusPublisher(){
        observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers){
            observer.update(queued, brewing, ready);
        }
    } 

    public void statusChanged(){
        notifyObservers();
    }

    public void setStatus(boolean queued, boolean brewing, boolean ready){
        this.queued = queued;
        this.brewing = brewing;
        this.ready = ready;
        statusChanged();
    }
    
}