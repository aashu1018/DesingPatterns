package DesignPatterns.ObserverDesingPattern;

public interface Subject {

    void subscribe(Observer ob);

    void unsubscribe(Observer ob);

    void notifyObservers();
}
