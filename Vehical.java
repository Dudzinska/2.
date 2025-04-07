public class Vehical {
    protected String brand;
    protected String model;
    protected  int rokProdukcji;
    protected double maxSpeed;
    protected Engine engine;

    public Vehical(String brand, String model, int rokProdukcji, double maxSpeed, Engine engine) {
        this.brand = brand;
        this.model = model;
        this.rokProdukcji = rokProdukcji;
        this.maxSpeed = maxSpeed;
        this.engine = engine;
    }

    public void displayInfo(){
        System.out.println("Marka: "+brand+" Model: "+model+" Rok produkcji: "+rokProdukcji+" maxymalna predkosc: "+maxSpeed+"km/h, silnik: ");
        engine.displayInfo();
    }
}
