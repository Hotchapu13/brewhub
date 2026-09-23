package observer;

public interface Observer{
    public void update(boolean queued, boolean brewing, boolean ready);
}