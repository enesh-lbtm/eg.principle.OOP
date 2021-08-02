package com.task.trigonometric;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//
      //  Вычислить значение выражения по формуле (все переменные принимают действительные значения):
        //𝑠𝑖𝑛 𝑥 +𝑐𝑜𝑠 𝑦
     //   𝑐𝑜𝑠 𝑥 − 𝑠𝑖𝑛 𝑦 ∗ 𝑡𝑔 𝑥𝑦

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the x: ");
        int x = sc.nextInt();
        System.out.println("Enter the y: ");
        int y = sc.nextInt();
        float rez = (float) (Math.sin(x)+Math.cos(y));
        float rez1 = (float) (Math.cos(x) + Math.sin(y) + (Math.tan(x) * Math.tan(y)));
        System.out.println("result of calculate Trigonometric function: "+rez+", "+rez1);
    }
}
