import java.util.Random;
import java.util.Scanner;

/** Java 1, Homework 3
 * @author Elizaveta Elyashova
 * @version 20/08/2018
 */

public class Homework3 {
    public static void main (String args[]) {

        guessNumber();

        guessWord();

    }

    private static void guessNumber () {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int number = 0;
        int comp_number;
        int decision = 1;

        System.out.println("Компьютер загадал число от 0 до 9");
        System.out.println("Ваша задача - угадать это число с 3 попыток");
        System.out.println("После каждой попытки компьютер будет говорить, загаданное число больше или меньше");

        while (decision == 1) {
            comp_number = random.nextInt(10);
         for (int i = 1; i < 4; i++) {
             System.out.println ("Введите число");
             number = scan.nextInt();
             if (number == comp_number) System.out.println ("Победа! Количество попыток: " + i);
             else if (number > comp_number) System.out.println ("Загаданное число меньше");
             else System.out.println ("Загаданное число больше");
         }
         if (number != comp_number) System.out.println ("Вы проиграли");
         System.out.println ("Повторить игру еще раз? 1 – да / 0 – нет");
         decision = scan.nextInt();
        }
    }

    private static void guessWord () {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut",
                "pear", "pepper", "pineapple", "pumpkin", "potato"};
        Random random = new Random();
        Scanner scan = new Scanner(System.in);

        char[] help = new char[15];
        for (int i = 0; i<15; i++) help[i] = '#';

        int word_number = random.nextInt(words.length);
        String player_word = "null";
        String comp_word = words[word_number];

        System.out.println ("Компьютер загадал слово. Ваша задача его угадать. Тема игры - растительные продукты.");
        System.out.println ("После каждой Вашей попытки отгадать слово, компьютер будет показывать, какие буквы угаданы верно.");
        System.out.println ("Используйте только строчные буквы.");

        while (player_word != comp_word) {
            System.out.println("Введите слово");
            player_word = scan.next();
                int n; int c = 0;
                if (player_word.length() > comp_word.length()) n = comp_word.length();
                else n = player_word.length();
                for (int i = 0; i < n; i++) {
                    if (player_word.charAt(i) == comp_word.charAt(i)) {
                        help[i] = player_word.charAt(i);
                        c++;
                    }
                }
                if (c == comp_word.length()) {
                    System.out.println("Вы угадали слово! Игра окончена.");
                    break;
                }
                else {
                    System.out.println("Вы угадали следующие буквы");
                    for (int i = 0; i < 15; i++) System.out.print(help[i]);
                    System.out.println("");
                    c = 0;
                }
        }
    }
}
