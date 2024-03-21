package observer.pattern.java;

public interface Subject {
    public void registerObserver(Observer obs);
    public void removeObserver(Observer obs);
    public void notifyObserver(Pedido pedido);
}
