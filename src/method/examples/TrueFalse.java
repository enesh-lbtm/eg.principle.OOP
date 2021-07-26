package method.examples;

public class TrueFalse {

    static boolean moreThanFive(int a){
        if(a > 5){
            return true;
        }
        else{
        return false;
        }
    }
    public static void main(String[] args) {
        System.out.println("Число: "+ moreThanFive(3));
    }
}
