package com.call.by.value.examples;

 class Swap {
    //1. обьявить переменные
     //2. преоброзовать string в инт
     //3. вызов по ссылке
     int a = 5;
     String n = "10";
     int c;
     private int x;
     Swap(int i, int j){
         a = i;
         x = j;
         c = a;
     }


   public void swapping(Swap swap){
        int x =Integer.parseInt(n);
        swap.a = swap.x;
        swap.x = swap.c;
     }


     public static void main(String... args) {
     Swap swap = new Swap(13,40);

         System.out.println("Before swapping: "+swap.a + " "+swap.x);
          swap.swapping(swap);
         System.out.println("After swapping: "+ swap.a + " " + swap.x);

//            int x = Integer.parseInt(n);
//
//            int j = 6;
//            System.out.println(x + j);
//        }
     }
 }