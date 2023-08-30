public class ServiceStationForOwners implements ServiceStation {
    @Override
    public void check(Bicycle bicycle) {
        if (bicycle != null) {
            System.out.println("Обслуживаем велосипед " + bicycle.modelName);
            System.out.println(bicycle.getWheelsCount() + " штук повреждено!");
                bicycle.updateTyre();

        }
    }


    @Override
    public void check(Car car) {


        if (car != null) {
            System.out.println("Обслуживаем машину " + car.modelName);
            System.out.println(car.getWheelsCount() + " штук повреждено!");
            car.updateTyre();


            car.checkEngine();
        }
    }

    @Override
    public void check(Truck truck) {
        if (truck != null) {
            System.out.println("Обслуживаем Грузовик " + truck.modelName);
            System.out.println(truck.getWheelsCount() + " штук повреждено!");
                truck.updateTyre();
            truck.checkEngine();
            truck.checkTrailer();

        }
    }

}
