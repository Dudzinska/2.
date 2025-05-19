public class Pizzeria {

    public enum PizzaSize {
        MALA(25, 18.9),
        SREDNIA(30, 25.9),
        DUZA(40, 32.9);

        private final int srednica;
        private final double cena;

        PizzaSize(int srednica, double cena) {
            this.srednica = srednica;
            this.cena = cena;
        }

        public int getSrednica() {
            return srednica;
        }

        public double getCena() {
            return cena;
        }
    }
}