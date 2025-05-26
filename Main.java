import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> pesels = new ArrayList<>();

        System.out.println("Wprowadź PESELe (wpisz 'STOP' aby zakończyć):");

        while (true) {
            System.out.print("> ");
            String input = scanner.nextLine().trim();
            if (input.equalsIgnoreCase("STOP")) break;

            if (input.matches("\\d{11}")) {
                pesels.add(input);
            } else {
                System.out.println("Nieprawidłowy PESEL.");
            }
        }

        int women = 0, men = 0;
        int count1950_1980 = 0, sumAge1950_1980 = 0;
        int count1981_2000 = 0, sumAge1981_2000 = 0;
        int count2001_2025 = 0, sumAge2001_2025 = 0;

        List<String> formattedDates = new ArrayList<>();

        for (String pesel : pesels) {
            LocalDate birthDate = parseDateFromPesel(pesel);
            int age = Period.between(birthDate, LocalDate.now()).getYears();
            int year = birthDate.getYear();

            boolean isFemale = Character.getNumericValue(pesel.charAt(9)) % 2 == 0;
            if (isFemale) women++;
            else men++;

            if (year >= 1950 && year <= 1980) {
                count1950_1980++;
                sumAge1950_1980 += age;
            } else if (year >= 1981 && year <= 2000) {
                count1981_2000++;
                sumAge1981_2000 += age;
            } else if (year >= 2001 && year <= 2025) {
                count2001_2025++;
                sumAge2001_2025 += age;
            }

            formattedDates.add(birthDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        }

        System.out.println("\n--- WYNIKI ---");
        System.out.println("Kobiet: " + women);
        System.out.println("Mężczyzn: " + men);
        System.out.println("1950–1980: " + count1950_1980 + " osób, średni wiek: " + average(count1950_1980, sumAge1950_1980));
        System.out.println("1981–2000: " + count1981_2000 + " osób, średni wiek: " + average(count1981_2000, sumAge1981_2000));
        System.out.println("2001–2025: " + count2001_2025 + " osób, średni wiek: " + average(count2001_2025, sumAge2001_2025));

        try (FileWriter writer = new FileWriter("wyniki.txt")) {
            for (String date : formattedDates) {
                writer.write(date + "\n");
            }
            System.out.println("\nZapisano daty urodzenia do pliku wyniki.txt");
        } catch (IOException e) {
            System.out.println("Błąd zapisu do pliku: " + e.getMessage());
        }
    }

    public static LocalDate parseDateFromPesel(String pesel) {
        int year = Integer.parseInt(pesel.substring(0, 2));
        int month = Integer.parseInt(pesel.substring(2, 4));
        int day = Integer.parseInt(pesel.substring(4, 6));

        int century;
        if (month >= 1 && month <= 12) {
            century = 1900;
        } else if (month >= 21 && month <= 32) {
            century = 2000;
            month -= 20;
        } else if (month >= 41 && month <= 52) {
            century = 2100;
            month -= 40;
        } else {
            throw new IllegalArgumentException("Nieprawidłowy miesiąc w PESEL: " + pesel);
        }

        year += century;
        return LocalDate.of(year, month, day);
    }

    public static int average(int count, int sum) {
        return count == 0 ? 0 : sum / count;
    }
}