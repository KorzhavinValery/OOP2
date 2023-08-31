public class Bicycle extends Vehicles {

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void service(){
        super.service();
    }

    @Override
    public String toString() {
        return "Bicycle " +
                "modelName= " + modelName +
                ", wheelsCount= " + wheelsCount;
    }
}
