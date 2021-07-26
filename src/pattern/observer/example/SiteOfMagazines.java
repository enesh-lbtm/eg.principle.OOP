package pattern.observer.example;

public class SiteOfMagazines {
    public static void main(String[] args) {
        Site site = new Site();
        site.addMagazines("1 is: Forbs");
        site.addMagazines("2 is: Elle");


        Observer firstreader = new Reader("Pasha");
        Observer secondreader = new Reader("Enesh");
        Observer thridreader = new Reader("Jahan");

        site.addObserver(firstreader);
        site.addObserver(secondreader);
        site.addObserver(thridreader);

        site.addMagazines("3 is: Glamour");



    }
}
