package examples;

public class ForTwoRomb {
    public static void main(String [] args) {
        int x = 11;
        int y = 11;

        for (int i = 0; i < x; i++) {

            for (int j = 0; j < y; j++) {

                if (j == y / 2 - i || j == y / 2 + i || j == i - y / 2 || j == x - i + x / 2 - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
