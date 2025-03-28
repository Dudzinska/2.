import java.util.Scanner;

public class Task6 {
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Podaj 5 liczb:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.print("Silnie: ");
        for (int num : numbers) {
            System.out.print(Utils.factorial(num) + " ");
        }
        System.out.println();
    }
}