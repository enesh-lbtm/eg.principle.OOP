package pattern.observer.example;

import java.util.ArrayList;
import java.util.List;

public class Site implements Observered{
    List<String> magazines = new ArrayList<>();
    List<Observer> readers = new ArrayList<>();
    public void addMagazines(String magazin){
        this.magazines.add(magazin);
        notifyObservers();

    }

    @Override
    public void addObserver(Observer observer) {
        this.readers.add(observer);


    }


    @Override
    public void notifyObservers() {
        for(Observer observer: readers){
            observer.handleEvent(this.magazines);
        }

    }


}
