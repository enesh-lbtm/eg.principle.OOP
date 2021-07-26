package examples;

public class PhraseGenerator {
    public static void main(String[] args) {
        String [] word = {"Enesh", "Lola", "Jahan"};
        int x= word.length;
        int rand = (int) (Math.random()* word.length);
        String phrase = word[rand];
        System.out.println("Ну вот, это мой первый генератор фраз - " + phrase);
    }
}
