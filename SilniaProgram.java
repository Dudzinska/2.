public class SilniaProgram {

    public static long silnia(int n) throws BlednaWartoscDlaSilniException {
        if (n < 0) {
            throw new BlednaWartoscDlaSilniException("Silnia nie jest zdefiniowana dla liczb ujemnych.");
        }

        long wynik = 1;
        for (int i = 2; i <= n; i++) {
            wynik *= i;
        }
        return wynik;
    }

    public static void main(String[] args) {
        try {
            int liczba = 5;
            long wynik = silnia(liczba);
            System.out.println("Silnia z " + liczba + " to " + wynik);
        } catch (BlednaWartoscDlaSilniException e) {
            System.out.println("Błąd: " + e.getMessage());
        }
    }
}


class BlednaWartoscDlaSilniException extends Exception {
    public BlednaWartoscDlaSilniException(String message) {
        super(message);
    }
}