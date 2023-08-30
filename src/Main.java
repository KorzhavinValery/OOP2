// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Car car = new Car("Avto Sedan 1", 4);
        Car car2 = new Car("Avto Sedan 2", 4);

        Truck truck = new Truck("Kamaz1", 6);
        Truck truck2 = new Truck("Kamaz2", 8);

        Bicycle bicycle = new Bicycle("Velik1", 2);
        Bicycle bicycle2 = new Bicycle("Velik2", 2);

        ServiceStation serviceStationForClients = new ServiceStationForClients();
        ServiceStation serviceStationForOwners = new ServiceStationForOwners();

        serviceStationReport(serviceStationForClients, car, bicycle, truck);
        serviceStationReport(serviceStationForOwners, car2, bicycle2, truck2);
    }

    private static void serviceStationReport(ServiceStation serviceStation, Car car, Bicycle bicycle, Truck truck) {
        serviceStation.check(car);
        serviceStation.check(bicycle);
        serviceStation.check(truck);
    }
}