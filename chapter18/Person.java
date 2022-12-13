package chapter18;

public class Person {
    String name, sex;
    int age;

    Person(String name, String sex, int age){
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    void CheckStatus(){
        var sb = new StringBuilder();
        sb.append("Name : " + name + '\n');
        sb.append("Sex  : " + sex + '\n');
        sb.append("Age  : " + age );
        System.out.println(sb.toString());
    }
}
