package com.home.task.avarage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        CalculateAvarage cal = new CalculateAvarage();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a ");
        Float a = sc.nextFloat();
        System.out.println("Enter b ");
        Float b = sc.nextFloat();
        //System.out.println("Чтобы найти среднию введите а и б: "+cal.calAvare(sc.nextFloat(), sc.nextFloat()));
        System.out.println( "avarage: "+cal.calAvare(a,b));
    }
}
