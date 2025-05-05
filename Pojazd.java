import java.time.LocalDateTime;
import java.time.Duration;

public class Pojazd {
    private String id;
    private String typ;
    private double cenaZaGodzine;
    private boolean jestWypożyczony;
    private LocalDateTime czasWypożyczenia;

    public Pojazd(String id, String typ, double cenaZaGodzine) {
        this.id = id;
        this.typ = typ;
        this.cenaZaGodzine = cenaZaGodzine;
        this.jestWypożyczony = false;
    }

    public boolean wypożycz() {
        if (jestWypożyczony) {
            System.out.println("Pojazd " + id + " jest już wypożyczony.");
            return false;
        }
        jestWypożyczony = true;
        czasWypożyczenia = LocalDateTime.now();
        System.out.println("Pojazd " + id + " został wypożyczony.");
        return true;
    }

    public double zwróć() {
        if (!jestWypożyczony) {
            System.out.println("Pojazd " + id + " nie był wypożyczony.");
            return 0;
        }
        LocalDateTime teraz = LocalDateTime.now();
        Duration czasTrwania = Duration.between(czasWypożyczenia, teraz);
        double godziny = czasTrwania.toMinutes() / 60.0;
        double koszt = Math.round(godziny * cenaZaGodzine * 100.0) / 100.0;
        jestWypożyczony = false;
        czasWypożyczenia = null;
        System.out.println("Pojazd " + id + " zwrócony. Koszt: " + koszt + " zł.");
        return koszt;
    }

    public String getId() {
        return id;
    }
}