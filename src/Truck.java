public class Truck extends MotorTransport {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public Truck() {

    }
    public void checkTrailer() {
        System.out.println("Проверяем прицеп у "+ getModelName());
    }
    @Override
    public void service() {
        updateTyre();
        checkEngine();
        checkTrailer();
    }
}