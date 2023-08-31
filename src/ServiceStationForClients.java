public class ServiceStationForClients implements ServiceStation {
    @Override
    public void check(Vehicles transport) {
        System.out.println(transport.getModelName());
        transport.service();
    }

}
