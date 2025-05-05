public class Main {
    public static void main(String[] args) throws InterruptedException {
        SystemWypożyczeń systemWypożyczeń = new SystemWypożyczeń();
        systemWypożyczeń.dodajPojazd("A1", "Samochód", 25.0);
        systemWypożyczeń.dodajPojazd("B2", "Rower", 10.0);
        systemWypożyczeń.dodajPojazd("C3", "Hulajnoga", 15.0);
        systemWypożyczeń.wypożyczPojazd("A1");
        Thread.sleep(3000);
        systemWypożyczeń.zwróćPojazd("A1");
    }
}