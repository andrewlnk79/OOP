package lesson1;

public class Bus extends Transport {
  private   String route;

    void load() {
        System.out.println("люди заходят в автобус");
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }
}
