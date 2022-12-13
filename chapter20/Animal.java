package chapter20;

public abstract class Animal {
    String name;
    abstract void makeSound();

    void setName(String name){
        this.name = name;
    }

    void showName(){
        System.out.println("Name : " + name);
    }
}
