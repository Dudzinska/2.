import java.util.Objects;

public class Uczestnik {
    private int id;
    private String imie;
    private int wiek;

    public Uczestnik(int id, String imie, int wiek) {
        this.id = id;
        this.imie = imie;
        this.wiek = wiek;
    }

    public int getWiek() {
        return wiek;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Imię: " + imie + ", Wiek: " + wiek;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Uczestnik)) return false;
        Uczestnik inny = (Uczestnik) obj;
        return id == inny.id && Objects.equals(imie, inny.imie) && wiek == inny.wiek;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, imie, wiek);
    }
}