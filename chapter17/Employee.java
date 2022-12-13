package chapter17;

public class Employee {
    String fname, lname, title, address, sex;
    int age;

    Employee(String fname, String lname, String title, String address, String sex, int age){
        this.fname = fname;
        this.lname = lname;
        this.title = title;
        this.address = address;
        this.sex = sex;
        this.age = age;
    }

    Employee(String fname, String lname, String title){
        this.fname = fname;
        this.lname = lname;
        this.title = title;
        this.address = "N/A";
        this.sex = "N/A";
        this.age = 0;
    }

    Employee(){
        this.fname = "N/A";
        this.lname = "N/A";
        this.title = "N/A";
        this.address = "N/A";
        this.sex = "N/A";
        this.age = 0;
    }
}
