package chapter24;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        var names = new ArrayList<String>();
        names.add("Gernel");
        names.add("Jayjay");
        names.add("Tatsumi");

        System.out.println(names.get(1));

        names.remove(0);
        names.clear();

        var students = new ArrayList<Student>();
        students.add(new Student("Gernel", "BSCS"));
        students.add(new Student("Jayjay", "BSIT"));
        students.add(new Student("Tatsumi", "BSED"));

        students.get(2).introduce();

        students.set(2, new Student("Zeref", "BSCS"));

        students.get(2).introduce();

    }
}
