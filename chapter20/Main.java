package chapter20;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        
        dog.setName("Browny");
        cat.setName("Kitty"); 

        dog.showName();
        cat.showName();
       
    }
}
