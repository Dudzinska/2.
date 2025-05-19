import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentDatabase db = new StudentDatabase();

        System.out.println("\n--- Tworzenie obiektów klasy Osoba ---");
        Osoba osoba1 = new Osoba();
        Osoba osoba2 = new Osoba("Jan", 25);
        Osoba osoba3 = new Osoba("Anna", "Kowalska", 30);

        osoba1.pokazDane();
        osoba2.pokazDane();
        osoba3.pokazDane();

        System.out.println("\n--- Tworzenie obiektów klasy Student ---");
        Student student1 = new Student("Jan", "Kowalski");
        Student student2 = new Student("Anna", "Nowak", 12345);
        Student student3 = new Student("Piotr", "Zalewski", 23456, "Informatyka");
        Student student4 = new Student("Maria", "Wiśniewska", 34567, "Matematyka", 2);

        student1.pokazDane();
        student2.pokazDane();
        student3.pokazDane();
        student4.pokazDane();

        System.out.println("\n--- Wprowadzanie danych studenta ---");
        System.out.print("Podaj imię: ");
        String imie = scanner.nextLine();

        System.out.print("Podaj nazwisko: ");
        String nazwisko = scanner.nextLine();

        System.out.print("Podaj numer indeksu: ");
        int nrIndeksu = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Podaj specjalność: ");
        String specjalnosc = scanner.nextLine();

        System.out.print("Podaj rok studiów: ");
        int rokStudiow = scanner.nextInt();

        Student nowyStudent = new Student(imie, nazwisko, nrIndeksu, specjalnosc, rokStudiow);
        nowyStudent.pokazDane();

        System.out.println("\n--- Dodawanie studenta do bazy ---");
        db.dodajStudenta(0, student1);
        db.dodajStudenta(1, student2);
        db.dodajStudenta(2, nowyStudent);

        System.out.println("\n--- Wyświetlanie wszystkich studentów ---");
        db.pokazWszystkich();

        System.out.println("\n--- Edycja studenta pod indeksem 1 ---");
        Student studentEdytowany = new Student("Karol", "Malinowski", 45678, "Biotechnologia", 3);
        db.edytujStudenta(1, studentEdytowany);

        db.pokazStudenta(1);

        System.out.println("\n--- Usunięcie studenta pod indeksem 2 ---");
        db.usunStudenta(2);

        db.pokazStudenta(2);

        scanner.close();
    }
}