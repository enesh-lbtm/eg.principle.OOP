package com.squaredesign.task;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        FindSquare fs = new FindSquare();
        int resultOfDiscriminant = 0;
        int resultOfSqrtDiscriminant = 0;
        int korenOne =0;
        int korenTwo =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите а: ");
        Integer a = sc.nextInt();
        System.out.println("Введите b: ");
        Integer b = sc.nextInt();
        System.out.println("Введите c: ");
        Integer c = sc.nextInt();
//        System.out.println("Дискриминант и корни дискриминанта если он есть: "+fs.findDiskramimant(a,b,c));

        if(a != 0){
            resultOfDiscriminant = (int) (Math.pow(b,2)-(4 * a * c));
//            resultOfSqrtDiscriminant = (int) Math.sqrt(resultOfDiscriminant);
            System.out.println("Discriminant: "+ resultOfSqrtDiscriminant);
            if(resultOfDiscriminant > 0){
                korenOne = (int) (((-1*(Math.pow(b,2))) - (resultOfDiscriminant)) / (2 * a));
                System.out.println("koren One: "+ korenOne);
                korenTwo= (int) (((-1*(Math.pow(b,2))) + (resultOfDiscriminant)) / (2 * a));
            } else if(resultOfDiscriminant == 0){
                korenOne = ((-1) * b)/(2 * a);
                System.out.println("koren two: "+ korenTwo);
            }
            else{
                System.out.println("Дискриминант равень 0, корней нет!!!");
            }

        }else {
            System.out.println("a is 0!!!!");
        }


    }
}
