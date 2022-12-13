package chapter24;

public class Student {
    String name, crs;
    Student(String name, String crs){
        this.name = name;
        this.crs = crs;
    }

    void introduce(){
        System.out.println("I am " + name);
        System.out.println("From " + crs);
    }
}
