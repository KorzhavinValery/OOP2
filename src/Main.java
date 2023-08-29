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


        ServiceStation station = new ServiceStation();
        station.check(car, null, null);
        station.check(car2, null, null);
        station.check(null, bicycle, null);
        station.check(null, bicycle2, null);
        station.check(null, null, truck);
        station.check(null, null, truck2);
    }
}