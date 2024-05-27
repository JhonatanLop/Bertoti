package observer.pattern.java;

import java.util.ArrayList;

public class Skinao{
    private ArrayList<Observer> observers;
    private Pedido pedido;

    public Skinao(){
        observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer obs) {
        observers.add(obs);
    }

    public void removeObserver(Observer obs) {
        for (Observer observer : observers) {
            if (observer == obs) {
                observers.remove(obs);
            }
        }
    }

    public void notifyObserver(Pedido pedido){
        for (Observer observer : observers) {
            observer.update(pedido);
        }
    }

}
