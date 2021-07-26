package examples;

public class ForStars {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {

             if(i==(n/2) && j==(n/2)){
                System.out.print("*");
                continue;
                }

                if (i + j == (n / 2)) {
                    System.out.print("*");
                    continue;
                }

                if(j - i  == (n / 2)){
                  System.out.print("*");
                    continue;
                }

                if(i+j==(n+(n/2))){
                    System.out.print("*");
                    continue;
                }

                if(i-j==(n-(n/2))){
                   System.out.print("*");
                   continue;
                }

                System.out.print(" ");
            }
            System.out.println();

        }
    }
}
