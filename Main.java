import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj rozmiar pizzy (MALA, SREDNIA, DUZA): ");
        String input = scanner.nextLine().toUpperCase().trim();

        try {
            Pizzeria.PizzaSize rozmiar = Pizzeria.PizzaSize.valueOf(input);
            System.out.println("Wybrano: " + rozmiar);
            System.out.println("Średnica: " + rozmiar.getSrednica() + " cm");
            System.out.println("Cena: " + rozmiar.getCena() + " zł");
        } catch (IllegalArgumentException e) {
            System.out.println("Nieznany rozmiar. Dostępne opcje: MALA, SREDNIA, DUZA.");
        }
    }
}