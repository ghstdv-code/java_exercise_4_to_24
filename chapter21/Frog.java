package chapter21;

public class Frog implements Animal, WaterAnimal, LandAnimal{
    public void makeSound(){
        System.out.println("Ribbit!");
    }

    public void walk(){
        System.out.println("Walk");
    }

    public void swim(){
        System.out.println("Swim");
    }
}
