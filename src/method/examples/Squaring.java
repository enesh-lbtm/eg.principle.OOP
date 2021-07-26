package method.examples;

import java.util.Scanner;

public class Squaring {
 public int squaring(int a){
    return (int) (Math.pow(a, 2)+2);
}

    public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
        Squaring s= new Squaring();
        //int b = 0;
        System.out.println("Число в квадрате прибавленное на два "+ s.squaring(6));


    }
}
