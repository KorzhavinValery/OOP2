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
        serviceStationForClients.check(car);
        serviceStationForClients.check(bicycle2);
        serviceStationForClients.check(truck2);

    }
}