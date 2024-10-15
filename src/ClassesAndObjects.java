public class ClassesAndObjects {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.addFuel(5);
        myCar.drive();
        System.out.println(myCar.getCurrentFuelInLiters());
        Car.message();
        myCar.message();
    }
}
