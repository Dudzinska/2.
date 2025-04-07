class FuelType {
    private String type;
    private int capacity;
    private int currentLevel;

    public FuelType(String type, int capacity, int currentLevel) {
        this.type = type;
        this.capacity = capacity;
        this.currentLevel = currentLevel;
    }

    public void review() {
        System.out.println("Fuel type: " + type);
        System.out.println("Capacity: " + capacity);
        System.out.println("Current level: " + currentLevel);
    }
}

