public abstract class Figura {
    protected Punkt srodek;

    public Figura(Punkt srodek) {
        this.srodek = srodek;
    }

    public abstract String opis();
    public abstract void skaluj(float skala);
}