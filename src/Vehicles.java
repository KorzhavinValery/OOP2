public class Vehicles {
    protected String modelName;
    protected int wheelsCount;

    public Vehicles(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    public void service() {
        for (int i = 0; i < wheelsCount; i++) {
            updateTyre();
        }
    }

    @Override
    public String toString() {
        return "Vehicles{" +
                "modelName= " + modelName +
                ", wheelsCount= " + wheelsCount;
    }
}
