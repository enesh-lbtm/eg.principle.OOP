package polimorpgism.overload;

import java.util.Objects;

public class Calculator {
    public static void main(String[] args) {
        System.out.println(summa(2, 3));
        System.out.println(summa(3.7F, 2.8F));






    }
    static int summa(short a, short b){
        return a+b;
    }
    static int summa(byte a, byte b){
        return a+b;
    }
    static int summa(int a, int b){
        return a+b;
    }
    static float summa(float a, float b){
        return a-b;
    }
    static double summa(double a, double b){
        return a * b;
    }
}
