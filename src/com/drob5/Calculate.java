package com.drob5;

public class Calculate {
    public void findDrob(int m, int n){
        Integer rez = m/n;
        System.out.println("Целая часть: "+rez);
        Integer rez1 = (m % n);
        System.out.println("Дробная часть: "+rez1);
    }
}
