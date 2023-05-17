public class Car extends MotorTransport {

    private String modelName;
    private int wheelsCount;

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public Car() {

    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }


    @Override
    public void service() {

    }
}