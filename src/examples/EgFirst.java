package examples;

public class EgFirst {
    public static void main(String[] args) {
        int x = 3;
        while(x>0){
            if (x > 2){
                System.out.print("a");
            }
            if (x==2){
                System.out.print("b  c");
            }
            System.out.print("-");
            x--;
            if (x == 1){
                System.out.print("d");
                x--;
            }
        }
    }
}
