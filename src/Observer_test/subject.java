package Observer_test;

public interface subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notiflyObserver(Observer o);
}

interface Observer{
    public void update(float temp,float humidity,float pressure);
}
