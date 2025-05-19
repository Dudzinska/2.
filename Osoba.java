public class Osoba {
    private String imie;
    private String nazwisko;
    private int wiek;

    public Osoba() {
        this.imie = "";
        this.nazwisko = "";
        this.wiek = 0;
    }
    public Osoba(String imie, int wiek) {
        this.imie = imie;
        this.nazwisko = "";
        this.wiek = wiek;
    }
    public Osoba(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    public void pokazDane() {
        System.out.println("Imię: " + imie + ", Nazwisko: " + nazwisko + ", Wiek: " + wiek);
    }
}