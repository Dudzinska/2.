import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wybierz zadanie do uruchomienia:");
        System.out.println("1 - Obliczanie pierwiastka");
        System.out.println("2 - Obliczanie silni");
        System.out.println("3 - Tworzenie adresu");
        System.out.print("Twój wybór: ");

        int wybor = scanner.nextInt();
        scanner.nextLine(); // czyszczenie bufora

        switch (wybor) {
            case 1:
                uruchomPierwiastek(scanner);
                break;
            case 2:
                uruchomSilnie(scanner);
                break;
            case 3:
                uruchomAdres(scanner);
                break;
            default:
                System.out.println("Nieprawidłowy wybór.");
        }
    }

    // Zadanie 1
    private static void uruchomPierwiastek(Scanner scanner) {
        try {
            System.out.print("Podaj liczbę: ");
            String input = scanner.nextLine();
            double liczba = Double.parseDouble(input);

            if (liczba < 0) {
                throw new IllegalArgumentException("Nie można obliczyć pierwiastka z liczby ujemnej.");
            }

            double wynik = Math.sqrt(liczba);
            System.out.println("Pierwiastek z " + liczba + " to " + wynik);
        } catch (NumberFormatException e) {
            System.out.println("Błąd: To nie jest poprawna liczba.");
        } catch (IllegalArgumentException e) {
            System.out.println("Błąd: " + e.getMessage());
        }
    }

    // Zadanie 2
    private static void uruchomSilnie(Scanner scanner) {
        try {
            System.out.print("Podaj liczbę do obliczenia silni: ");
            int n = scanner.nextInt();
            long wynik = obliczSilnie(n);
            System.out.println("Silnia z " + n + " to " + wynik);
        } catch (InputMismatchException e) {
            System.out.println("Błąd: To nie jest liczba całkowita.");
        } catch (BlednaWartoscDlaSilniException e) {
            System.out.println("Błąd: " + e.getMessage());
        }
    }

    private static long obliczSilnie(int n) throws BlednaWartoscDlaSilniException {
        if (n < 0) {
            throw new BlednaWartoscDlaSilniException("Silnia nie jest zdefiniowana dla liczb ujemnych.");
        }

        long wynik = 1;
        for (int i = 2; i <= n; i++) {
            wynik *= i;
        }
        return wynik;
    }

    // Zadanie 3
    private static void uruchomAdres(Scanner scanner) {
        try {
            System.out.print("Podaj ulicę: ");
            String ulica = scanner.nextLine();

            System.out.print("Podaj numer domu: ");
            int numerDomu = scanner.nextInt();
            scanner.nextLine(); // czyszczenie bufora

            System.out.print("Podaj kod pocztowy: ");
            String kod = scanner.nextLine();

            System.out.print("Podaj miasto: ");
            String miasto = scanner.nextLine();

            Adres adres = new Adres(ulica, numerDomu, kod, miasto);
            System.out.println("Adres poprawny: " + adres);
        } catch (NieprawidlowyAdresException e) {
            System.out.println("Błąd: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Błąd: Numer domu musi być liczbą całkowitą.");
        }
    }
}
