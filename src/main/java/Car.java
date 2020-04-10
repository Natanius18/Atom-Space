public class Car {
    private int size;
    private String model;
    private int fuel;
    private int maxSpeed;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Size:" + this.size + "\nModel:" + this.model + "\nMax Speed:" + this.maxSpeed + "\nFuel:" + this.fuel;
    }

    public Car(int Size, String Model, int Fuel, int MaxSpeed) {
        size = Size;
        model = Model;
        fuel = Fuel;
        maxSpeed = MaxSpeed;
    }
    public void fuelOut() {
        System.out.println("Fuel volume: " + getFuel());
    }
}

