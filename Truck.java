public class Truck extends Vehical{
    private double loadCapacity;

    public Truck(String brand, String model, int rokProdukcji, double maxSpeed, double loadCapacity) {
        super(brand, model, rokProdukcji, maxSpeed);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Maksymalna pojemnosc: "+loadCapacity+"ton");
    }
}
