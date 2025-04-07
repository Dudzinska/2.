public class Engine {
    private int power;
    private String fuelType;

    public Engine(int power, String fuelType) {
        this.power = power;
        this.fuelType = fuelType;
    }

    public void startEngine() {
        System.out.println("Silnik uruchomiony (" + power + " KM, " + fuelType + ")");
    }

    public int getPower() {
        return power;
    }

    public String getFuelType() {
        return fuelType;
    }
}