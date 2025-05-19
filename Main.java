import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Podaj ulicę: ");
            String ulica = scanner.nextLine();

            System.out.print("Podaj numer domu: ");
            int numerDomu = Integer.parseInt(scanner.nextLine());

            System.out.print("Podaj kod pocztowy: ");
            String kodPocztowy = scanner.nextLine();

            System.out.print("Podaj miasto: ");
            String miasto = scanner.nextLine();

            Adres adres = new Adres(ulica, numerDomu, kodPocztowy, miasto);
            System.out.println("Wprowadzony adres:");
            System.out.println(adres);

        } catch (NieprawidlowyAdresException e) {
            System.out.println("Błąd w adresie: " + e.getMessage());


        }
    }
}