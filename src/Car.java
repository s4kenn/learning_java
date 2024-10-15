public class Car {

    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuelInLiters;
    int noOfSeats;

    public static void message() {
        System.out.println("Hello Moto");
    }

    public void drive() {
        System.out.println("Car is driving");
        currentFuelInLiters--;
    }

    public void addFuel(float fuel) {
        currentFuelInLiters += fuel;
    }

    public float getCurrentFuelInLiters() {
        return currentFuelInLiters;
    }


}
