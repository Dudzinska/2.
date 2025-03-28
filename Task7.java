import java.util.Arrays;

public class Task7 {
    public static void run() {
        String[] array1 = {"Java", "Python", "C++"};
        String[] array2 = {"Java", "Python", "C++"};

        boolean areEqual = Arrays.equals(array1, array2);
        System.out.println("Czy tablice są identyczne? " + (areEqual ? "Tak" : "Nie"));
    }
}
