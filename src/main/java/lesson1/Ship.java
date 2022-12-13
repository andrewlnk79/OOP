package lesson1;

public class Ship extends Transport implements CanSwim {
   private int waterLine;

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

    @Override
    public void swim() {

            System.out.println("плывет медленно");
        }
    }

