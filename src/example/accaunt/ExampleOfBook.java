package example.accaunt;

import java.util.Scanner;


public class ExampleOfBook {

    static Scanner reader=new Scanner(System.in);
    public static void main(String args []) {
/*/        double a = 7.5d;
//        double b=0;
//        double c=0;
//          b  = a * a;
//          c = b;
//
//
//        System.out.println(b);
//        c = a * a * a;
//
//        b=c;
//
////        System.out.println(c);
//        int a = 4;
//        int b = 7;
//        int c = 0;
//        System.out.println(c);
tasks

         1)System.out.println("Hello, world");
        2)System.out.println("\"h-e-l-l-o,-f-r-i-e-n-d!\"");
        3)System.out.println("\n1.line: + + +\n"+"2.line:! ! ! !\n"+"3.line:? ?\n");
        4)System.out.println("\n1.line: + + +"+"2.line:! ! ! !"+"3.line:? ?\n all is in one line");
        5)int a = reader.nextInt();
        5)System.out.println("aa="+(a * a));
        5)System.out.println("a10="+(a + 10));

  //6      System.out.println("enter the number: ");
        int a = reader.nextInt();
        System.out.print(""+(a)+"\n");
        System.out.print(""+ (a+1)+"\n");
//6        System.out.print(""+ (a-2)+"\n");/*/
        //7
//        System.out.println("enter the number: ");
//        float a = reader.nextFloat();
//        System.out.println(a - (10 * a));
//      8 int x=0;
//int j= 1;
//while(j <= 6){
//    j++;
//    if(j == 6){
//        x=j;
//        System.out.println(x);
//      //  System.out.println(Math.pow(x,2));
//        //System.out.println(Math.pow(x,3));
//        System.out.println(x * x);
//        System.out.println(x * x * x);
//    }
//}
//        int x = 0;
//        int j = 1;
//        while( j<=9){
//            j++;
//            if(j == 9){
//                x = j;
//                System.out.println("x equals: " + x);
//                System.out.println("square of x equals: " + (x * x));
//            }
//        }

    }
}


class A {
//    @Override
//    public int hashCode() {
//        return super.hashCode();
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        return super.equals(obj);
//    }
//
//    public static void main(String[] args) {
//      String s ;
//
////    }
//    int a[]={ 1,2,3,4};
//    int age;
//    String name;
//
//    @Override
//    public int hashCode(){
//        return 31 * name.hashCode() + age;
//    }
//    @Override
//    public boolean equals(Object o){
//        if(this==o) return true;
//        if(o == null) return false;
//        if(getClass()!= o.getClass()){
//
//        }
//
//
//    }

//    public static void main(String[] args) {
//
//            Integer c;
//            Scanner scaner = new Scanner(System.in);
//            System.out.print("enter a ");
//            int a = scaner.nextInt();
//            System.out.print("enter b ");
//            a += scaner.nextInt();
//            c = Integer.valueOf(a);
//            System.out.println(c);
//        }
//public static void main(String ... args){
//    int a []= {2,3,4,5,6};
//    // правильный вариант
//    for (int i=0; i < a.length; i++){
//        System.out.println(a[i]);
//    }
//    //for (int i=0; i <a[i]; i ++){
//        //System.out.println(a[i]); если так написать будеть исключение, так как длина массива так не находиться.
//    // Здесь индекс массива выходить за предел памяти массиваю
// //   }
//}
//public static void main(String[] args) {
//    int a[]=new int[5];
//a[0]=1;
//a[1]=2;
//a[2]=3;
//a[3]=4;
//// так как я не проинициализировала 5 элемент, компилятор автоматически присвоил ему 0;
//for(int i=0;i<a.length;i++){
//    System.out.println(a[i]);
//}
//}
//public static void main(String[] args) {
//    int arr[]={33,4,5,6,6};
//    for (int i:
//         arr) {
//        System.out.println(i+=i);
//    }
//}
//public static void main(String[] args) {
//    int a [] ={1,2,3,4,5};
//
//}

    //}
//class B{
//    static void min(int[] arr){
//        int min = arr[0];
//        for(int i =1; i< arr.length; i++){
//            if(min > arr[i]){
//                min = arr[i];
//                System.out.println(min);
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        int a []= {1,2,31,3,45,5};
//        min(a);
//    }
//}
//    static class Testarray2 {
//        //creating a method which receives an array as a parameter
//        static void min(int arr[]) {
//            int max = arr[0];
//            for (int i = 1; i < arr.length; i++)
//                if (max < arr[i])
//                    max = arr[i];
//
//            System.out.println(max);
//        }
//
//        public static void main(String args[]) {
//            int a[] = {33, 3, 4, 5};//declaring and initializing an array
//            min(a);//passing array to method
//        }
//   /
//    public static void main(String[] args) {
//        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
//        for (int i = 0; i < 3; i++){
//            for( int j=0; j < 3; j++)
//                System.out.println(arr[i][j] + "");
//            }
//        System.out.print("");
//    }

//    public static void main(String[] args) {
//        int arr[][]=new int [3][];
//        arr[0]=new int[3];
//        arr[1]=new int[4];
//        arr[2]=new int[5];
//       int count=0;
//        System.out.println("Просумированные элементы массива: ");
//        for(int i=0; i < arr.length; i++){
//            for(int j=0; j < arr.length; j++){
//                arr[i][j]=count++;
//                System.out.println(count+"\t");
//            }
//            System.out.println(" \t");
//     }
//        System.out.println("Исходные элементы массива: ");
//      for(int i=0; i < arr.length; i++){
//            for(int j=0; j< arr.length; j++){
//                System.out.println(arr[i][j]+"");
//            }
//          System.out.println(" ");
//        }
//    }
//public static void main(String[] args) {
//int arr[]={1,2,3};
//Class c = arr.getClass();
//String name=c.getName();
//    System.out.println(name);
//}
//public static void main(String[] args) {
//    //обьявление исходного массива
//    char [] copyFrom = {'d', 'e', 'c','a', 'f', 'f','e','i',
//            'n','a','t','e','d'};
//    // обьявление массива для копирования
//    char[] copyTo = new char[7];
//    System.arraycopy(copyFrom ,2,copyTo, 0,7);
//
//    System.out.println(String.valueOf(copyTo));
//
//}



}
class Ella{
//    public static void main(String[] args) {
//        int a[][]={{1,2,3},{3,4,5}};
//        int b[][]={{1,2,3},{3,4,5}};
//        int c[][]=new int [2][3];
//        for(int i=0; i <2;i++){
//            for(int j=0; j<3; j++){
//                c[i][j]=a[i][j]+b[i][j];
//                System.out.println(c[i][j]+" ");
//            }
//            System.out.print(" ");
//        }
//    }
public static void main(String[] args) {
    int a[][]={{1,1,1},{2,2,2},{3,3,3}};
    int b[][]={{1,1,1},{2,2,2},{3,3,3}};
    int c[][]=new int[3][3];
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            c[i][j]=0;
            for(int k=0;k<3;k++){
                c[i][j]+=a[i][k]*b[k][j];
            }
//            c[i][j]=a[i][j]*b[i][j];
            System.out.println(c[i][j]+" ");
        }
        System.out.println(" ");
    }
}


}

