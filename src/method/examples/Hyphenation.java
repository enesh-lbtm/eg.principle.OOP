package method.examples;

public class Hyphenation {
    static  int hyp(int a, int b, int c, int d){
        return (int) (Math.pow(a,b) + Math.pow(c, d));
    }

    public static void main(String[] args) {
        System.out.println("Первое число в заданной степени просумированное на второе числе в степени: " +hyp(2,2,3,2));

    }
}
