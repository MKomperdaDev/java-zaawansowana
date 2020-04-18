import vehicles.Car;


public class VehiclesMain {
    public static void main(String[] args) {
        Car[] cars = new Car[5];
        cars[0] = new Car("BMW", "530");
        cars[1] = new Car("Audi", "A3");
        cars[2] = new Car("Honda", "Jazz");
        cars[3] = new Car("Mazda", "3");
        cars[4] = new Car("Merc", "S");

        cars[2].setModel("Star");

        for (Car car : cars) {
            car.show();
        }
    }


}
