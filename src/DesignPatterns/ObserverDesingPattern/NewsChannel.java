package DesignPatterns.ObserverDesingPattern;

import java.util.ArrayList;
import java.util.List;

public class NewsChannel implements Subject{

    List<Observer> observers = new ArrayList<>();
    private String news;

    public void setNews(String news){
        this.news = news;
        notifyObservers();
    }

    @Override
    public void subscribe(Observer ob) {
        observers.add(ob);
    }

    @Override
    public void unsubscribe(Observer ob) {
        observers.remove(ob);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers){
            observer.update(news);
        }
    }

}
