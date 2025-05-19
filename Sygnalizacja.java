import java.util.Scanner;

public class Sygnalizacja {


    enum Swiatlo {
        CZERWONE("Stój!"),
        ZOLTE("Uwaga!"),
        ZIELONE("Jedź!");

        private final String komunikat;

        Swiatlo(String komunikat) {
            this.komunikat = komunikat;
        }

        public String getKomunikat() {
            return komunikat;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj kolor sygnalizacji (CZERWONE, ZOLTE, ZIELONE): ");
        String input = scanner.nextLine().toUpperCase().trim();

        try {
            Swiatlo swiatlo = Swiatlo.valueOf(input);
            System.out.println("Komunikat: " + swiatlo.getKomunikat());
        } catch (IllegalArgumentException e) {
            System.out.println("Niepoprawny kolor. Użyj: CZERWONE, ZOLTE lub ZIELONE.");
        }
    }
}