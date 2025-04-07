
public class Kwadrat extends Prostokat {

    public Kwadrat(float bok, String kolor) {
        super(bok, bok, kolor);
    }

    public float getBok() {
        return szerokosc;
    }

    public void setBok(float bok) {
        this.szerokosc = bok;
        this.wysokosc = bok;
    }

    @Override
    public void opis() {
        System.out.println("Kwadrat: bok " + szerokosc + ", kolor: " + kolor);
    }
}