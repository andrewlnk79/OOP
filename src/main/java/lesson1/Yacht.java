package lesson1;

public class Yacht extends Transport implements  CanSwim{
    private int speed;

    void load() {
        System.out.println("загружаем феерверки и алкоголь");
    }
}
