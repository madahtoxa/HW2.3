public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        Car car2 = new Car();
        car.setModelName("car1");
        car2.setModelName("car2");
        car.setWheelsCount(4);
        car2.setWheelsCount(4);
        car.service(car, null, null);
        car2.service(car2, null, null);

        Truck truck = new Truck();
        Truck truck2 = new Truck();
        truck.setModelName("truck1");
        truck2.setModelName("truck2");
        truck.setWheelsCount(6);
        truck2.setWheelsCount(8);

        truck.service(null,null,truck);
        truck2.service(null,null,truck2);

        Bicycle bicycle = new Bicycle();
        Bicycle bicycle2 = new Bicycle();
        bicycle.setModelName("bicycle1");
        bicycle2.setModelName("bicycle2");
        bicycle.setWheelsCount(2);
        bicycle2.setWheelsCount(2);

        bicycle.service(null,bicycle,null);
        bicycle2.service(null,bicycle2,null);

    }
}

