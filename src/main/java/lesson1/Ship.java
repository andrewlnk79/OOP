package lesson1;

public class Ship extends Transport {
    int waterLine;

    public int getWaterLine() {
        return waterLine;
    }

    public void setWaterLine(int waterLine) {
        this.waterLine = waterLine;
    }
@Override
    void load() {
    System.out.println("погрузка корабля");

    }
}
