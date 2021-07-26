package method.examples;

public class Cube {
public  int cub(int a){
    return a*a*a;
}
    public static void main(String[] args) {
        Cube c = new Cube();
        System.out.println("Куб данного числа равен: "+ c.cub(5));
}
}
