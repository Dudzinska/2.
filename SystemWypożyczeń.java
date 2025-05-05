import java.util.HashMap;

public class SystemWypożyczeń {
    private HashMap<String, Pojazd> pojazdy = new HashMap<>();

    public void dodajPojazd(String id, String typ, double cenaZaGodzine) {
        Pojazd p = new Pojazd(id, typ, cenaZaGodzine);
        pojazdy.put(id, p);
        System.out.println("Dodano pojazd: " + id);
    }

    public void wypożyczPojazd(String id) {
        Pojazd p = pojazdy.get(id);
        if (p != null) {
            p.wypożycz();
        } else {
            System.out.println("Nie znaleziono pojazdu o ID: " + id);
        }
    }

    public void zwróćPojazd(String id) {
        Pojazd p = pojazdy.get(id);
        if (p != null) {
            p.zwróć();
        } else {
            System.out.println("Nie znaleziono pojazdu o ID: " + id);
        }
    }
}
