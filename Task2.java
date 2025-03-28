public class Task2 {
    public static void run() {
        int[] evenArray = {2, 4, 6, 8, 10, 12};
        int[] oddArray = {1, 3, 5, 7, 9};

        System.out.print("Zadanie 2 (parzysta): ");
        for (int i = 0; i < evenArray.length; i += 2) {
            System.out.print(evenArray[i] + " ");
        }

        System.out.print("\nZadanie 2 (nieparzysta): ");
        for (int i = 0; i < oddArray.length; i += 2) {
            System.out.print(oddArray[i] + " ");
        }
        System.out.println();
    }
}