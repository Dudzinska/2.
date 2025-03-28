import java.util.Random;

public class Task1 {
    public static void run() {
        int[] numbers = Utils.generateRandomArray(10, 1, 100);
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        double average = (double) sum / numbers.length;
        System.out.println("Zadanie 1: Suma = " + sum + ", Średnia = " + average);
    }
}