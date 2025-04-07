public class Main {
    public static void main(String[] args) {
        Punkt p1 = new Punkt();
        Punkt p2 = new Punkt(3, 4);
        Punkt p3 = new Punkt(10, -5);

        p1.opis();
        p2.przesun(2, 2);
        p2.opis();
        p3.zeruj();
        p3.opis();

        Prostokat prostokat = new Prostokat(5, 10, "czerwony");
        prostokat.opis();
        prostokat.przesun(3, 5);

        Trojkat trojkat = new Trojkat(4, 6, "zielony");
        trojkat.opis();

        Kwadrat kwadrat = new Kwadrat(7, "niebieski");
        kwadrat.opis();

        Okrag okrag = new Okrag(new Punkt(0, 0), 5);
        okrag.opis();
        System.out.println("Powierzchnia: " + okrag.getPowierzchnia());
        System.out.println("Czy punkt (3,4) w środku? " + okrag.wSrodku(new Punkt(3, 4)));
    }
}