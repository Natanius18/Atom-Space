public class Main {
    public static void main(String[] args) {
        Car RangeRover = new Car(10, "Range Rover", 90, 270);
        System.out.println(RangeRover.toString());
        RangeRover.fuelOut();
    }
}
