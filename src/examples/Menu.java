package examples;


import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = -1;
        int choice2 = -1;
        while(choice!=0){
            System.out.println("Welcome to our menu!" +
                    "\n1-Print a4" +
                    "\n2-print a5" +
                    "\n3-scanner" +
                    "\n0-go back." +
                    "\nPlease, enter your choice: ");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    while(choice2!=0){
                        System.out.println("print a4" +
                                "\n 0-go back" +
                                "\n Enter your choice: ");
                        choice2= sc.nextInt();

                                    }
                    break;
                case 2:
                    while (choice2!=0){
                        System.out.println("print a5" +
                                "\n 0-go back" +
                                "\n Enter your choice: ");
                        choice2 = sc.nextInt();
                    }
                    break;
                case 3:
                    while(choice2!=0){
                        System.out.println("scanner" +
                                "\n 0-go back" +
                                "\n Enter your choice: ");
                        choice2 = sc.nextInt();
                    }
                    break;
                default:
                    System.out.println("your choice not found!\n");
            }
        }
    }
}
