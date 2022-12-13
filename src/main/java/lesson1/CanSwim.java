package lesson1;

public interface CanSwim {
    default  void swim(){
        System.out.println("плывет как-то");
    }
}
