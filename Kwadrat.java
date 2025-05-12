public class Kwadrat extends Prostokat {
    public Kwadrat(Punkt srodek, float bok) {
        super(srodek, bok, bok);
    }

    @Override
    public String opis() {
        return "Kwadrat (środek: " + srodek + ", bok: " + szerokosc + ")";
    }
}