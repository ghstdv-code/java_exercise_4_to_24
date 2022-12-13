package chapter21;

public interface AirAnimal extends LandAnimal{
    void fly();
    default void sayHello(){
        System.out.println("Hello");
    }
}
