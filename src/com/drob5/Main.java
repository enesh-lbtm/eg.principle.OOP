package com.drob5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the M: ");
        Integer m = sc.nextInt();
        System.out.println("Enter the N: ");
        Integer n =sc.nextInt();
        System.out.println("You are entered: "+m+"/"+n);
        Integer rez = m/n;
        System.out.println("Целая часть: "+rez);
        Integer rez1 = (m % n);
        System.out.println("Дробная часть: "+rez1);
    }
}
