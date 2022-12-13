package lesson1;

public class App {
    public static void main(String[] args) {
        Transport[] transports=new Transport[]{new Bus(),new Yacht(),new Ship()};
        for(Transport transport:transports){
            transport.load();
            if (transport instanceof  Bus){
                Bus bus=(Bus) transport;
                System.out.println(bus.getRoute());
            }
        }
    }
}
