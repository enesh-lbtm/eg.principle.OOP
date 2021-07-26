package examples;
import java.util.Scanner;

public class LoopForStars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n1: ");
        int n1=sc.nextInt();
        System.out.print("Enter the n2: ");
        int n2=sc.nextInt();
        int max=0;
        if(n1>n2){
            max=n1;
        }else{
            max=n2;
        }
        for(int i=2; i<=max; i++){
            if(n1%i == 0 && n2 % i == 0){
                System.out.println(i);
            }
        }
       /*/ for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){

                System.out.print("* ");
            }
            System.out.println();//new line
      /*/
      /*/  int term=6;
        for(int i=1;i<=term;i++){
            for(int j=term;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println();//new line
        }
    }
  /*  }

       */

     /*/   int n= 21;
        for(int i = 1; i<= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
               // System.out.println(n);
            }
        }
        System.out.println(n);
    }
/*

      */



    }
}
