public class Bicycle extends Transport {

    private String modelName;
    private int wheelsCount;

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    public Bicycle(){

    }
    public void updateTyre() {
        System.out.println("Меняем покрышку");
        //не применял интерфейс, так как в пришлось бы
        // реализовывать все методы. В заданнии не сказано что интерфейсы нужно делать для всех классов
    }
}
