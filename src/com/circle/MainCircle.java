package com.circle;

import java.util.Scanner;

public class MainCircle {
    public static void main(String[] args) {
        float p=3.14F;
        Scanner sc = new Scanner(System.in);
        System.out.println("Emter the radius: ");
        float radius=sc.nextFloat();
        float s = 2 * p * radius;
        System.out.println("Длина окружности: "+s);
        float squareOfOkruznost = s / 2;
        System.out.println("Площадь круга ограниченная ограниченная окружностью равна: "+squareOfOkruznost);

    }
}
