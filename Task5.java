import java.util.Arrays;
import java.util.Scanner;

public class Task5 {
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[8];

        System.out.println("Podaj 8 liczb:");
        for (int i = 0; i < 8; i++) {
            numbers[i] = scanner.nextInt();
        }

        Arrays.sort(numbers);
        System.out.println("Posortowane liczby: " + Arrays.toString(numbers));
    }
}