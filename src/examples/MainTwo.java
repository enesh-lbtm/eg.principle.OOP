package examples;

public class MainTwo {
    public static void main(String[] args) {
        int beerNum = 99;
        String word = "Бутылок";
        String word1= "Бутылки";
        while(beerNum>0){
            if (beerNum==1){
                word = "Бутылка";
            }
            System.out.println(beerNum + " " + word + " пива на стене");
            System.out.println(beerNum + " " + word1 + " пива");
            System.out.println("Возьми одну");
            System.out.println("Пусти по кругу");
            beerNum = beerNum -  1;
          }
    }


}
