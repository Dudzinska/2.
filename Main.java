import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wybierz zadanie do uruchomienia:");
        System.out.println("1 - Liczenie unikalnych imion");
        System.out.println("2 - Dopasowywanie par imion");
        System.out.println("3 - Obsługa uczestników wydarzenia");
        System.out.println("4 - Operacje na tablicy i subList");
        System.out.println("5 - Odwracanie listy przez ListIterator");
        System.out.print("Twój wybór: ");

        int wybor = scanner.nextInt();
        scanner.nextLine();

        switch (wybor) {
            case 1 -> zadanie1(scanner);
            case 2 -> zadanie2(scanner);
            case 3 -> zadanie3();
            case 4 -> zadanie4();
            case 5 -> zadanie5();
            default -> System.out.println("Nieprawidłowy wybór.");
        }
    }

    // Zadanie 1
    private static void zadanie1(Scanner scanner) {
        Set<String> imiona = new HashSet<>();
        System.out.println("Wprowadzaj imiona (\"-\" kończy):");
        while (true) {
            String imie = scanner.nextLine();
            if (imie.equals("-")) break;
            imiona.add(imie);
        }
        System.out.println("Liczba unikalnych imion: " + imiona.size());
    }

    // Zadanie 2
    private static void zadanie2(Scanner scanner) {
        Map<String, String> pary = new HashMap<>();
        System.out.println("Wprowadzaj imiona par (\"-\" kończy):");
        while (true) {
            System.out.print("Imię 1: ");
            String imie1 = scanner.nextLine();
            if (imie1.equals("-")) break;

            System.out.print("Imię 2: ");
            String imie2 = scanner.nextLine();
            pary.put(imie1, imie2);
        }

        System.out.print("Podaj jedno z wcześniej wprowadzonych imion: ");
        String szukane = scanner.nextLine();
        String partner = pary.get(szukane);
        if (partner != null) {
            System.out.println("Partnerem " + szukane + " jest " + partner);
        } else {
            System.out.println("Nie znaleziono takiego imienia.");
        }
    }

    // Zadanie 3
    private static void zadanie3() {
        List<Uczestnik> uczestnicy = new LinkedList<>();
        uczestnicy.add(new Uczestnik(1, "Anna", 25));
        uczestnicy.add(new Uczestnik(2, "Bartek", 17));
        uczestnicy.add(new Uczestnik(3, "Celina", 30));
        uczestnicy.add(new Uczestnik(4, "Dawid", 15));

        System.out.println("Wszyscy uczestnicy:");
        for (Uczestnik u : uczestnicy) {
            System.out.println(u);
        }

        System.out.println("\nPełnoletni uczestnicy:");
        List<Uczestnik> pelnoletni = filtrujPelnoletnich(uczestnicy);
        for (Uczestnik u : pelnoletni) {
            System.out.println(u);
        }
    }

    private static List<Uczestnik> filtrujPelnoletnich(List<Uczestnik> lista) {
        List<Uczestnik> wynik = new ArrayList<>();
        for (Uczestnik u : lista) {
            if (u.getWiek() >= 18) {
                wynik.add(u);
            }
        }
        return wynik;
    }

    // Zadanie 4
    private static void zadanie4() {
        Klasa[] tablica = {
                new Klasa("A"), new Klasa("B"), new Klasa("C"),
                new Klasa("D"), new Klasa("E")
        };

        List<Klasa> lista = new ArrayList<>(Arrays.asList(tablica));
        System.out.println("Pełna lista: " + lista);

        List<Klasa> podlista = lista.subList(1, 4);
        System.out.println("Podlista: " + podlista);

        podlista.clear(); // usuwa z oryginalnej listy!
        System.out.println("Lista po usunięciu podlisty: " + lista);
    }

    // Zadanie 5
    private static void zadanie5() {
        List<Integer> lista1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> lista2 = new ArrayList<>();

        ListIterator<Integer> iterator = lista1.listIterator(lista1.size());
        while (iterator.hasPrevious()) {
            lista2.add(iterator.previous());
        }

        System.out.println("Pierwotna lista: " + lista1);
        System.out.println("Lista odwrócona: " + lista2);
    }
}