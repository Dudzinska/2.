public class Student {
    private String imie;
    private String nazwisko;
    private int nrIndeksu;
    private String specjalnosc;
    private int rokStudiow;

    public Student(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nrIndeksu = 0;
        this.specjalnosc = "";
        this.rokStudiow = 0;
    }

    public Student(String imie, String nazwisko, int nrIndeksu) {
        this(imie, nazwisko);
        this.nrIndeksu = nrIndeksu;
    }

    public Student(String imie, String nazwisko, int nrIndeksu, String specjalnosc) {
        this(imie, nazwisko, nrIndeksu);
        this.specjalnosc = specjalnosc;
    }
    public Student(String imie, String nazwisko, int nrIndeksu, String specjalnosc, int rokStudiow) {
        this(imie, nazwisko, nrIndeksu, specjalnosc);
        this.rokStudiow = rokStudiow;
    }

    public void pokazDane() {
        System.out.println("Imię: " + imie + ", Nazwisko: " + nazwisko + ", Nr indeksu: " + nrIndeksu +
                ", Specjalność: " + specjalnosc + ", Rok studiów: " + rokStudiow);
    }
}
