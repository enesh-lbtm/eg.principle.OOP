package pattern.observer.example;

import java.util.List;

public class Reader implements Observer{
    String name;
    public Reader(String name){
        this.name=name;
    }
    @Override
        public void handleEvent(List<String> magazines) {
        System.out.println("Dear "+ name +" we have new magazine for you: \n\n==========\n\n" + magazines);

    }
}
