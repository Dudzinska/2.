public class Prostokat extends Figura implements IFigury {
    protected float szerokosc, wysokosc;  // Zmiana z private na protected

    public Prostokat(Punkt srodek, float szerokosc, float wysokosc) {
        super(srodek);
        this.szerokosc = szerokosc;
        this.wysokosc = wysokosc;
    }

    @Override
    public String opis() {
        return "Prostokąt (środek: " + srodek + ", szerokość: " + szerokosc + ", wysokość: " + wysokosc + ")";
    }

    @Override
    public void skaluj(float skala) {
        szerokosc *= skala;
        wysokosc *= skala;
    }

    @Override
    public float getPowierzchnia() {
        return szerokosc * wysokosc;
    }

    @Override
    public boolean wPolu(Punkt p) {
        return (p.x >= srodek.x - szerokosc / 2) &&
                (p.x <= srodek.x + szerokosc / 2) &&
                (p.y >= srodek.y - wysokosc / 2) &&
                (p.y <= srodek.y + wysokosc / 2);
    }
}