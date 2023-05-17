public abstract class MotorTransport extends Transport implements Interuse {
    private String modelName;
    private int wheelsCount;

    public MotorTransport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public MotorTransport() {
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку у " + modelName);

    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель у " + getModelName());
    }
}