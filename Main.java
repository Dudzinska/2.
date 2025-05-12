import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Figura[] tablicaFigur = new Figura[4];  // Zmniejszony rozmiar dla przykładu
        tablicaFigur[0] = new Prostokat(new Punkt(0, 0), 10, 5);
        tablicaFigur[1] = new Kwadrat(new Punkt(1, 1), 4);
        tablicaFigur[2] = new Trojkat(new Punkt(2, 2), 3, 4);
        tablicaFigur[3] = new Okrag(new Punkt(3, 3), 5);


        for (Figura figura : tablicaFigur) {
            System.out.println(figura.opis());
        }


        List<IFigury> figuryGeometryczne = new ArrayList<>();
        figuryGeometryczne.add(new Prostokat(new Punkt(0, 0), 4, 5));
        figuryGeometryczne.add(new Kwadrat(new Punkt(1, 1), 3));
        figuryGeometryczne.add(new Trojkat(new Punkt(2, 2), 5, 4));
        figuryGeometryczne.add(new Okrag(new Punkt(3, 3), 2));


        Punkt testowyPunkt = new Punkt(1, 1);
        for (IFigury figura : figuryGeometryczne) {
            System.out.println("Pole: " + figura.getPowierzchnia());
            System.out.println("Czy punkt " + testowyPunkt + " w polu? " + figura.wPolu(testowyPunkt));
        }


        Okrag okrag = new Okrag(new Punkt(0, 0), 5);
        System.out.println("Przed przesunięciem: " + okrag.opis());
        okrag.przesun(2, 3);
        System.out.println("Po przesunięciu: " + okrag.opis());
    }
}