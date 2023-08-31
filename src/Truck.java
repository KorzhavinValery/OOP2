public class Truck extends  Vehicles{
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }





    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
    @Override
    public void service() {
        super.service();
        checkEngine();
        checkTrailer();
    }

    @Override
    public String toString() {
        return "Truck " +
                "modelName= " + modelName +
                ", wheelsCount= " + wheelsCount;
    }
}
