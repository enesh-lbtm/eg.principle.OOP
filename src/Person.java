public class Person {
    private  String name;
    private String lastName;
    private int age;
    private  Adress adress;

    public Person(String name, String lastName, int age){
        this.name=name;
        this.lastName=lastName;
        this.age=age;
    }
}
class Adress{
    private String country;
    private String city;
    private  int street;

    public Adress(String country, String city, int street){
        this.city=city;
        this.country=country;
        this.street=street;
    }
}