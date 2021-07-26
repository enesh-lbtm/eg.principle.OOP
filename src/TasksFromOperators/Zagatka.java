package TasksFromOperators;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Zagatka {
    public static void main(String[] args) {
        String answer;
        boolean exit;
        System.out.println ("Что это такое: синий, большой, с усами и полностью набит зайцами?");
        Scanner inputAnswer = new Scanner (System.in);

        exit = false;
        for(int i = 1; i <= 3; i++){
            if (exit == true)
                break;
            answer = inputAnswer.next ();
            switch (answer){
                case ("Троллейбус"):
                    System.out.println ("Правильно!");
                    break;
                case ("Сдаюсь"):
                    System.out.println ("Правильный ответ: троллейбус.");
                    break;
                default:
                    System.out.println("Подумай еще.");
            }
        }

    }
}
