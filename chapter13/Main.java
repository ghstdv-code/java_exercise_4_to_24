package chapter13;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.firstName = "Gernel";
        person1.lastName = "Esguerra";
        person1.sex = 'M';
        person1.age = 22;
        
        Person person2 = new Person();
        person2.firstName = "Jayjay";
        person2.lastName = "Esguerra";
        person2.sex = 'M';
        person2.age = 25;

        System.out.println("Person1: " + person1.firstName);
        System.out.println("Person2: " + person2.firstName);
        
    }
}
