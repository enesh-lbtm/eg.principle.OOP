package com.String.examples;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Stringing {
    public static void main(String ... args){
        StringBuffer sb = new StringBuffer();
        sb.append(new Integer (2))
                .append("; ")
                .append(false)
                .append("; ")
                .append(Arrays. asList(1,2,3))
                .append("; ");
        System.out.println(sb);
    }
}
class A{
    public static void main(String[] args) {
        String numbers = "123456789";
//
//        StringBuffer sb = new StringBuffer(numbers);
//        System.out.println(sb.substring(1));
//        System.out.println(sb.substring(0, 3));
//        System.out.println(sb.reverse());
//        System.out.println(sb.replace(0,4, " mnesh"));
//        System.out.println(sb.insert(2, "e"));

    }
}
class B {
    public static void main(String[] args) {
        String numbers = "9876543210";

        StringBuilder sb = new StringBuilder(numbers);
        System.out.println(sb.substring(1));
        System.out.println(sb.substring(0, 3));
        System.out.println(sb.reverse());
        System.out.println(sb.replace(0, 4, " mnesh"));
        System.out.println(sb.insert(2, "e"));

    }
}
class C{
    public static void main(String ...args){
        String names = "  Alena Alice alina albina Anastasya ALLA Arina";
        names = names.trim();
        String a[] = names.split(" ");
        for(int j = 0; j< a.length -1; j++){
            for( int i = j + 1; i < a.length; i++){
                if(a[i].compareToIgnoreCase(a[j]) < 0){
                String temp=a[j];
                a[j]= a[i];
                a[i]= temp;
                }
            }
        }
for(String arg : a){
    if(!arg.isEmpty()){
        System.out.println(arg + " ");
    }
}

    }


}

class D{
    public static void main(String[] args) {
         int a[]={1,0,8,4,5,6};
         int max =0;
         int min =1;
         for( int i = 0; i < a.length; i++){
             if(max < a[i]){
                 max = a[i];

             }
         }
        System.out.println(max);
         for(int i =0;i<a.length; i++){
             if(min > a[i]){
                 min = a[i];
             }
         }
        System.out.println(min);
    }

}

class F{
    public static void main(String[] args) {
        char ascii [] = {66,67,68,69,70};
        String strBig = new String(ascii);
        String strSmall = new String(ascii, 2,3);
        System.out.println(strBig);
        System.out.println(strSmall);
        System.out.println(strBig.length()-1);

    }
}
class E{
    public static void main(String[] args) {
        String s= "Пример текстовой строки – язык Java";
        char buf[] = new char[9];
        s.getChars(s.length()-9,s.length(),buf,0);
        System.out.println(buf);
        char symbol;
        symbol=s.charAt(21);
        System.out.println(symbol);
        System.out.println("--------------------------");
        byte nums[];
        nums = s.getBytes();
        for( int i =0; i<s.length(); i++){
            System.out.println(nums[i]+" ");
            if((i+1)%6==0)
                System.out.println();
        }
        System.out.println("\n--------------------------");
        char chars[] = new char[s.length()];
        chars = s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' ') System.out.println("-->");
            else System.out.print(chars[i]+" * ");}

    }
}
/*/class getCharsDemo{
public static void main(String args[]){
// Текстовая строка:
String s="Пример текстовой строки – язык Java";
// Символьный массив:
char buf[]=new char[9];
s.getChars(s.length()-9,s.length(),buf,0);
System.out.println(buf);
// Символ:
char symbol;
symbol=s.charAt(21);
System.out.println(symbol);
// Разделитель:
System.out.println("--------------------------");
// Массив чисел:
byte nums[];
nums=s.getBytes();
for(int i=0;i<s.length();i++){
System.out.print(nums[i]+" ");
if((i+1)%6==0) System.out.println();}
// Разделитель:
System.out.println("\n--------------------------");
char chars[]=new char[s.length()];
chars =s.toCharArray();
for(int i=0;i<s.length();i++){
if(s.charAt(i)==' ') System.out.println("-->");
else System.out.print(chars[i]+" * ");}
}
}*/
class K{
    public static void main(String[] args) {
        int a[]={2,4,6,8,10,12,14,16,18,20};
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + ", ");
        }
    }
}
