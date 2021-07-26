package examples;

import java.util.Scanner;

public class MathExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x: ");
        int x = sc.nextInt();
        System.out.print("Enter m: ");
        int m = sc.nextInt();
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int z=0, rez1=0, rez2=0;
        for(int i = 0; i<=n;i++){
            rez1 += Math.cos(x) + ((Math.sin(x/5))/5);
        }
        for(int j=1; j<=m; j++){
            rez2 *= (Math.tan(x)) / Math.abs(x/5);
        }
        z = x + (rez1 * rez2)+ (1/Math.abs(x));
        System.out.println("result: " + z);
    }
}
