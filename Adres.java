public class Adres {
    protected String ulica;
    protected int numerDomu;
    protected String kodPocztowy;
    protected String miasto;

    public Adres(String ulica, int numerDomu, String kodPocztowy, String miasto) throws NieprawidlowyAdresException {
        StringBuilder blad = new StringBuilder();

        if (ulica == null || ulica.trim().isEmpty()) {
            blad.append("Ulica nie może być pusta.\n");
        }
        if (numerDomu <= 0) {
            blad.append("Numer domu musi być większy od zera.\n");
        }
        if (kodPocztowy == null || kodPocztowy.trim().isEmpty()) {
            blad.append("Kod pocztowy nie może być pusty.\n");
        }
        if (miasto == null || miasto.trim().isEmpty()) {
            blad.append("Miasto nie może być puste.\n");
        }
        if (blad.length() > 0) {
            throw new NieprawidlowyAdresException(blad.toString().trim());
        }


        this.ulica = ulica;
        this.numerDomu = numerDomu;
        this.kodPocztowy = kodPocztowy;
        this.miasto = miasto;
    }

    @Override
    public String toString() {
        return ulica + " " + numerDomu + ", " + kodPocztowy + " " + miasto;
    }
}