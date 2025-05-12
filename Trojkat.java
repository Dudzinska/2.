public class Trojkat extends Figura implements IFigury {
    private float podstawa, wysokosc;

    public Trojkat(Punkt srodek, float podstawa, float wysokosc) {
        super(srodek);
        this.podstawa = podstawa;
        this.wysokosc = wysokosc;
    }

    @Override
    public String opis() {
        return "Trójkąt (środek: " + srodek + ", podstawa: " + podstawa + ", wysokość: " + wysokosc + ")";
    }

    @Override
    public void skaluj(float skala) {
        podstawa *= skala;
        wysokosc *= skala;
    }

    @Override
    public float getPowierzchnia() {
        return (podstawa * wysokosc) / 2;
    }

    @Override
    public boolean wPolu(Punkt p) {
        return (p.x >= srodek.x - podstawa / 2) &&
                (p.x <= srodek.x + podstawa / 2) &&
                (p.y >= srodek.y - wysokosc / 2) &&
                (p.y <= srodek.y + wysokosc / 2);
    }
}