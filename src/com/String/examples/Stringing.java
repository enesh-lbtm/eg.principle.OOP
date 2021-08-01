package com.String.examples;

import java.util.Arrays;
import java.util.Locale;

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


class J{
    public static void main(String[] args) {
        // пример на charAt
        String str = "enesh";
        char result = str.charAt(2);
        char result2 = str.charAt(3);
        System.out.println(result);
        System.out.println(result2);
    }
}
class Q{
    //example of coedePointAt
    public static void main(String[] args) {
        String st = "Pusya";
        int rez = st.codePointAt(1);
        System.out.println(rez);

    }

}
class W{
    //example of codepointBefore
    public static void main(String[] args) {
        String s = "Ma2ma";
        int rez = s.codePointBefore(3);
        System.out.println(rez);
    }
}
class R{
    //example of codePoint Count
    public static void main(String[] args) {
       String s1 = "Mama2";
       int rez = s1.codePointCount(0,4);
        System.out.println(rez);
    }
}
class T{
    public static void main(String[] args) {
        //example of CompareTo
        String s1 = "Enesh";
        String s2 = "Enesh";
        String s3= "P";
        int rez = s1.compareTo(s2);
        int rez2 =s1.compareTo(s3);
        System.out.println(rez);
        System.out.println(rez2);
    }
}
class U{
    public static void main(String[] args) {
        //example of compareToIgnoreCase
        String s1="Enesha";
        String s2 = "P";
        int rez = s1.compareToIgnoreCase(s2);
        System.out.println(rez);
    }
}
class I{
    public static void main(String[] args) {
        //example of concat String
        String s1= "enesh yagshi koradi ";
        String s2 = "P";
        String s3 = s1.concat(s2);
        System.out.println(s3);
    }
}
class O{
    public static void main(String[] args) {
        //contains
        String s1 = "ella";
        boolean rez = s1.contains("e");
        System.out.println(rez);
    }
}
class P{
    public static void main(String[] args) {
        //contentEquals(CharSequence cs); сравнение заданой строки или символа с существующей строкой
        String s = "Flower";
        boolean rez = s.contentEquals("Flower");
        System.out.println(rez);
    }
}
class S{
    //contentEquals(String Buffer);
    public static void main(String[] args) {
        String s ="1Lola";
        boolean rez = s.contentEquals("Lola");
        System.out.println(rez);
    }
}
class G{
    public static void main(String[] args) {
        //copyValuof(char[] data)
       char s [] = {'e','n','e', 's', 'h', 'a'};
        String s2 = "";
        s2= s2.copyValueOf(s);
        System.out.println(s2);
    }

}
class H{
    public static void main(String[] args) {
        //copyvalueOf(char[], offset, count)
        char s [] = {'e','s','h','a'};
        String s1="";
        s1= s1.copyValueOf(s,0,2);
        System.out.println(s1);

    }
}
class L{
    //endsWith
    public static void main(String[] args) {
        String s ="ella";
        boolean s1 = s.endsWith("a");
        System.out.println(s1);
    }
}
class Z{
    public static void main(String[] args) {
        //equals
        String s = "Enesha";
        String s2 = "P";
        boolean rez = s.equals(s2);
        System.out.println(rez);
    }
}
class X{
    public static void main(String... args) {
        //format(locale l, String format, object)
     //   String s ="Enesha";
        float s2 = 1.1234567F;
        String str = String.format("%.2f", s2);
        System.out.println(str);
    }
}
class V{
    public static void main(String[] args) {
        //format(String format, Object... args)
        String s = "Ella";
        String str = String.format("My String is %s", s);
        System.out.println(str);

    }
}
class N{
    public static void main(String[] args) {
        String s = "enesha";
        byte s1 []=s.getBytes();
        System.out.println("1 method get bytes" + s1);
        String str = "Jahan";
        byte str2 [] = str.getBytes();
        System.out.println("2 method get bytes charset" + str2);
        String st = "Eshek  ol";
        byte st2 []= st.getBytes();
        System.out.println(st2);
        System.out.println(st.hashCode());
        int i = st.indexOf('h');
        System.out.println("i"+i);
        int j = st.indexOf("e",0);
        System.out.println("j"+j);
        int k = st.indexOf("eshek", 0);
        int l = st.indexOf("Ella");
        System.out.println(" l"+ l);
        System.out.println(st.intern());
        System.out.println(st.isEmpty());
        System.out.println(st.isBlank());
        System.out.println("lastindexOf ch "+st.lastIndexOf('s'));
        System.out.println("lastindex (str)" + st.lastIndexOf("en"));
        System.out.println("lastIndexOf(String, fromindex of) " +st.lastIndexOf("en",0));
        System.out.println("lastindesOf int ch, int fromIndexOf "+st.lastIndexOf('s',4));
        System.out.println("lenght "+st.length());
        boolean n=st.matches("en");
        System.out.println(" mathes- сообщвет соотведствует ли заданная строка регулярному выражению "+n);
        //не очень сильно поняла как оно работает
        System.out.println("offsetOfcodePoints "+st.offsetByCodePoints(0,2));
//тоже не очень поняла как работает
        boolean a = st.regionMatches(1,"Enesh",3,4);
        System.out.println(a);
        boolean e = st.regionMatches(true, 0,"ESHAEK", 3,4);
        System.out.println(e);
        System.out.println(st.replace('e','E'));
        System.out.println(st.replaceAll("Es","palvan"));
        System.out.println(st.replaceFirst("Eshe","Palvanchik"));
        String str3="Enesha, be strong";
        String [] parts = str3.split("-");
        for(String x : parts){
            System.out.println(x);
        }
        String [] parts2 = str3.split(" ",2);
        for(String x : parts2){
            System.out.println(x);
        }
        boolean w =str3.startsWith("Enesha",0);
        System.out.println(w);
        //subSequance and substring возвращают новую строку при заданных индексах
        System.out.println(str3.subSequence(0,4));
        System.out.println(str3.substring(4,6));
        char in[]=str3.toCharArray();
        System.out.println(in);
        System.out.println(str3.toUpperCase(Locale.ROOT));
        System.out.println(str3.toLowerCase(Locale.ROOT));
        System.out.println(str3.trim());
        long q = 123445555;
        System.out.println(String.valueOf(q));

//        // StringBuilder and String Buffer
//        StringBuilder stringBuilder= new StringBuilder("enesha");
//        System.out.println(stringBuilder.appendCodePoint(4));
//        System.out.println(stringBuilder.capacity()+" capacity");
//        System.out.println(stringBuilder.charAt(0)+" CharAt");
//        System.out.println(stringBuilder.codePointAt(5)+ " codePointAt");
//        System.out.println(stringBuilder.codePointBefore(5)+" codePointBefore");
//        System.out.println(stringBuilder.codePointCount(0,4)+ " codePointCount");
//        System.out.println(stringBuilder.delete(2,5)+ " delete");
//        System.out.println(stringBuilder.deleteCharAt(3));
//        stringBuilder.ensureCapacity(3);
//        System.out.println(stringBuilder);
//        char o[] = new char [7];
//        str3.getChars(2,4,o,0);
//        System.out.println(o);

    }

}

class M{
    public static void main(String[] args) {
        // StringBuilder and String Buffer
        StringBuilder stringBuilder= new StringBuilder("enesha");
        StringBuilder str3 = new StringBuilder("Sun");
        System.out.println(stringBuilder.appendCodePoint(4));
        System.out.println(stringBuilder.capacity()+" capacity");
        System.out.println(stringBuilder.charAt(0)+" CharAt");
        System.out.println(stringBuilder.codePointAt(5)+ " codePointAt");
        System.out.println(stringBuilder.codePointBefore(5)+" codePointBefore");
        System.out.println(stringBuilder.codePointCount(0,4)+ " codePointCount");
        System.out.println(stringBuilder.delete(2,5)+ " delete");
        System.out.println(stringBuilder.deleteCharAt(3));
        stringBuilder.ensureCapacity(3);
        System.out.println(stringBuilder);
        char o[] = new char [7];
        str3.getChars(0,3,o,0);
        System.out.println(o);
        StringBuffer str1= new StringBuffer("we are study programming");
        int h= str1.indexOf("u");
        System.out.println(h);
        int m = str1.indexOf("a",0);
        System.out.println(m);
        StringBuffer st=str1.insert(0,2);
        System.out.println(st);
        StringBuffer st2=str1.insert(7," enesh");
        System.out.println(st2);
        int st3 = str1.lastIndexOf("are");
        System.out.println(st3);
        int st4 = str1.lastIndexOf("we",6);
        System.out.println(st4);
        StringBuilder stt = new StringBuilder("Dislike the method");
        //не очень поняла. //теперь поняла
        int st5 = stt.offsetByCodePoints(5,3);
        System.out.println(" ofset " + st5+stt.charAt(8));
        StringBuffer stringBuffer = str1.replace(0,4,"dislike ");
        System.out.println("OffsetByodePoint "+stringBuffer);
       // StringBuffer st6 = str1.reverse();
       // System.out.println(st6);
        str1.setCharAt(0, 'p');
        System.out.println(str1);
        //str1.setLength(4);
        //System.out.println(str1);
        str1.subSequence(0,3);
        System.out.println(str1);
        String str5 = str1.substring(2);
        System.out.println(str5);
        String str6 = str1.substring(1,2);
        System.out.println(str6);
        str1.trimToSize();
        System.out.println(str1);
        StringBuilder str7 = new StringBuilder("1,2,2,2");
        Integer in = 9;
        System.out.println(in.toString());


    }
}
class PPPP{
    public static void main(String[] args) {
        String st = "        Enesh are sleep now         ";
        System.out.println(st);
        System.out.println(st.trim());
    }
}
