package examples;

import java.util.Scanner;

public class TestExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int externalValue = -1;
        int internalValue;
        int value2=0;
        String text = "";
        String booleanValue = "";
        String v2="";
        boolean vi;
        while (externalValue != 0) {
            System.out.println("1-conct String" +
                    "\n2-sum conc" +
                    "\n3-conc boolean" +
                    "\n0-exit");
            externalValue = sc.nextInt();
            switch (externalValue) {
                case 1:
                    System.out.println("1-enter String" + "\n0-exit");
                    internalValue = sc.nextInt();
                    while (internalValue != 0) {
                        System.out.println("enter the string");
                        sc.nextLine();
                        String str = sc.nextLine();
                        text += str;
                        System.out.println("Your text is: " + text);
                      System.out.println("1-enter String" + "\n0-exit");
                      internalValue = sc.nextInt();
                    }
                    break;
                case 2:
                    System.out.println("1-enter value" + "\n0-exit");
                    internalValue = sc.nextInt();
                    while(internalValue!=0){
                        System.out.println("enter the value");
                        int value1 = sc.nextInt();
                        value2 += value1;
                        System.out.println(value2);
                        System.out.println("1-enter value" + "\n0-exit");
                        internalValue = sc.nextInt();
                    }
                    break;
                case 3:
                    System.out.println("1-enter some value" + "\n0-exit");
                    internalValue = sc.nextInt();
                    while(internalValue!=0){
                        System.out.println("enter the some value");
                        sc.nextLine();
                        String str1 = sc.nextLine();
                        booleanValue += str1;
                        if(str1.equals("false") || str1.equals("-1")){
                            vi = false;
                        }
                        else{
                           vi = true;
                        }
                        String.valueOf(vi);
                        v2 += vi;
                        System.out.println(v2);

                        System.out.println("1-enter some value" + "\n0-exit");
                        internalValue = sc.nextInt();

                    }
                    break;
                default:
                    System.out.println("Your enter is not found! Please< repeat your enter");


            }
        }
    }
}
