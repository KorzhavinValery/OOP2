public class Car extends Vehicles {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
    @Override
    public void service(){
        super.service();
        checkEngine();
    }

    @Override
    public String toString() {
        return "Car " +
                "modelName= " + modelName +
                ", wheelsCount= " + wheelsCount;
    }
}
