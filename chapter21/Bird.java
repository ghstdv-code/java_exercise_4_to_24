package chapter21;

public class Bird implements Animal, AirAnimal{
    public void makeSound(){
        System.out.println("Twit-Twit!");
    }
    public void fly(){
        System.out.println("Fly");
    }

    public void walk(){
        System.out.println("Walk");
    }
}
