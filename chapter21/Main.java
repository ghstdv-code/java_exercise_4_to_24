package chapter21;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Bird bird = new Bird();
        Frog frog = new Frog();

        dog.makeSound();
        bird.makeSound();
        frog.makeSound();

        dog.walk();
        bird.fly();
        bird.walk();
        bird.sayHello();
    }
}
