import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.*;
        import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class PeselAnalyzer {

    public static class Person {
        private final String pesel;
        private final LocalDate birthDate;
        private final boolean isFemale;

        public Person(String pesel) {
            this.pesel = pesel;
            this.birthDate = parseDate(pesel);
            this.isFemale = Character.getNumericValue(pesel.charAt(9)) % 2 == 0;
        }

        public LocalDate getBirthDate() {
            return birthDate;
        }

        public boolean isFemale() {
            return isFemale;
        }

        public int getAge() {
            return Period.between(birthDate, LocalDate.now()).getYears();
        }

        public String getFormattedBirthDate() {
            return birthDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        }

        private LocalDate parseDate(String pesel) {
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

            return LocalDate.of(century + year, month, day);
        }
    }

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        try {
            File file = new File("pesele.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine().trim();
                if (line.matches("\\d{11}")) {
                    people.add(new Person(line));
                }
            }
            scanner.close();
        } catch (IOException e) {
            System.out.println("Błąd przy odczycie pliku: " + e.getMessage());
            return;
        }

        int women = 0, men = 0;
        int c1950_1980 = 0, s1950_1980 = 0;
        int c1981_2000 = 0, s1981_2000 = 0;
        int c2001_2025 = 0, s2001_2025 = 0;

        List<String> formattedDates = new ArrayList<>();

        for (Person p : people) {
            if (p.isFemale()) women++;
            else men++;

            int year = p.getBirthDate().getYear();
            int age = p.getAge();

            if (year >= 1950 && year <= 1980) {
                c1950_1980++; s1950_1980 += age;
            } else if (year >= 1981 && year <= 2000) {
                c1981_2000++; s1981_2000 += age;
            } else if (year >= 2001 && year <= 2025) {
                c2001_2025++; s2001_2025 += age;
            }

            formattedDates.add(p.getFormattedBirthDate());
        }

        System.out.println("Kobiet: " + women);
        System.out.println("Mężczyzn: " + men);
        System.out.println("1950–1980: " + c1950_1980 + " osób, średni wiek: " + avg(c1950_1980, s1950_1980));
        System.out.println("1981–2000: " + c1981_2000 + " osób, średni wiek: " + avg(c1981_2000, s1981_2000));
        System.out.println("2001–2025: " + c2001_2025 + " osób, średni wiek: " + avg(c2001_2025, s2001_2025));

        try {
            Path outputPath = Paths.get("wyniki.txt");
            Files.write(outputPath, formattedDates);
            System.out.println("Zapisano daty urodzenia do wyniki.txt");
        } catch (IOException e) {
            System.out.println("Błąd zapisu pliku: " + e.getMessage());
        }
    }

    private static int avg(int count, int sum) {
        return count == 0 ? 0 : sum / count;
    }
}