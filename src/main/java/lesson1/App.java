package lesson1;

public class App {
    public static void main(String[] args) {
        Transport[] transports = new Transport[]{
                new Bus(), new Yacht(), new Ship()
        };
        for (Transport transport : transports) {
            transport.load();
            if (transport instanceof CanSwim) {
                System.out.println("это умеет плавать");
                CanSwim canSwim = (CanSwim) transport;
                canSwim.swim();
            }
            if (transport instanceof Bus) {
                Bus bus = (Bus) transport;
                System.out.println("Маршрут: " + bus.getRoute());
            }
        }
    }
}
