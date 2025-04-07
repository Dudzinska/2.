public class Main {
    public static void main(String[] args) {
        FuelType dieselTank = new FuelType("Diesel", 120, 60);
        Engine truckEngine = new Engine(450, dieselTank);

        FuelType petrolTank = new FuelType("Petrol", 50, 30);
        Engine carEngine = new Engine(150, petrolTank);

        Car car = new Car("Toyota", "Corolla", 2020, false, carEngine, 5);
        Truck truck = new Truck("Volvo", "FH16", 2022, true, truckEngine, 20000);

        System.out.println("--- Car Info ---");
        car.displayInfo();
        car.startEngine();

        System.out.println("\n--- Truck Info ---");
        truck.displayInfo();
        truck.startEngine();
    }
}