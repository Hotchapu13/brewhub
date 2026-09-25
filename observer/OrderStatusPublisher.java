import java.util.*;

public class OrderStatusPublisher implements Subject{
    private List<Observer> observers;
    enum Status{
        QUEUED,
        BREWING,
        READY
    }
    Status status;

    public OrderStatusPublisher(){
        observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
        System.out.println(o + " has subscribed");
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
        System.out.println(o + " has unsubscribed");
    }

    @Override
    public void notifyObservers() {
        List<Observer> observerList = new ArrayList<Observer>(observers);
        for (Observer observer : observerList){
            observer.update();
        }
    } 

    public void statusChanged(){
        notifyObservers();
    }

    public void setStatus(Status status){
        this.status = status;
        statusChanged();
    }

    public String showSubscribers() {
        return observers.toString();
    }

    public Status getStatus(){
        return this.status;
    }
    
}