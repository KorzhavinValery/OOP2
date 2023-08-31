public class ServiceStationForClients implements ServiceStation {
    public void check(Vehicles transport) {
        System.out.println(transport.getModelName());
        transport.service();
    }

}
