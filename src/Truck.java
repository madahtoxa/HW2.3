public class Truck extends MotorTransport {

    private String modelName;
    private int wheelsCount;

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public Truck() {

    }


    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }




    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    public void check(Truck truck) {

        if (truck != null) {
            System.out.println("Обслуживаем " + truck.getModelName());
            for (int i = 0; i < truck.getWheelsCount(); i++) {
                truck.updateTyre();
            }
            truck.checkEngine();
            truck.checkTrailer();

        }
    }


    @Override
    public void service() {

    }
}