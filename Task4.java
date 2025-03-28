import java.util.Scanner;

public class Task4 {
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        String[] words = new String[5];

        System.out.println("Podaj 5 słów:");
        for (int i = 0; i < 5; i++) {
            words[i] = scanner.next();
        }

        System.out.print("Odwrócone słowa: ");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(new StringBuilder(words[i]).reverse().toString() + " ");
        }
        System.out.println();
    }
}