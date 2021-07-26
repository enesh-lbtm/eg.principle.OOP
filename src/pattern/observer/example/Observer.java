package pattern.observer.example;

import java.util.List;

public interface Observer {
    public void handleEvent(List<String> magazines); //собщать об изменениях
}
