public class Okrag extends Figura implements IFigury, RuchFigury {
    private float promien;

    public Okrag(Punkt srodek, float promien) {
        super(srodek);
        this.promien = promien;
    }

    @Override
    public String opis() {
        return "Okrąg (środek: " + srodek + ", promień: " + promien + ")";
    }

    @Override
    public void skaluj(float skala) {
        promien *= skala;
    }

    @Override
    public float getPowierzchnia() {
        return (float) (Math.PI * promien * promien);
    }

    @Override
    public boolean wPolu(Punkt p) {
        float dx = p.x - srodek.x;
        float dy = p.y - srodek.y;
        return (dx * dx + dy * dy) <= (promien * promien);
    }

    @Override
    public void przesun(int dx, int dy) {
        srodek.x += dx;
        srodek.y += dy;
    }
}

