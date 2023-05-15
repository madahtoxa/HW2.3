public class Truck extends Transport implements Interuse {

    private String modelName;
    private int wheelsCount;

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
        public Truck(){

        }
    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}
