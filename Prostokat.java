public class Prostokat extends Figura {
    protected float wysokosc;
    protected float szerokosc;
    protected Punkt punkt = new Punkt();

    public Prostokat() {}

    public Prostokat(float wys, float szer, String kolor) {
        super(kolor);
        this.wysokosc = wys;
        this.szerokosc = szer;
    }

    public void przesun(float dx, float dy) {
        punkt.przesun((int) dx, (int) dy);
    }

    @Override
    public void opis() {
        System.out.println("Prostokąt: " + szerokosc + " x " + wysokosc + ", kolor: " + kolor);
    }
}
