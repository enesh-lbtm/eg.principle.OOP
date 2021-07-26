package pattern.observer.example;

public interface Observered {
    public void addObserver(Observer observer); //добавлять наблюдателей
    public  void notifyObservers(); //оповещать наблюдателей
}
