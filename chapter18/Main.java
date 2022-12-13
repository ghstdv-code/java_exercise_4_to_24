package chapter18;

public class Main {
    public static void main(String[] args) {
        Person t = new Toodler("Tatsumi", "Male", 1, "Mobile Legends");
        Person p = new Person("Gernel", "Male", 22);
        Kid k = new Kid("Ruby", "Female", 6, "LOL", "Grade 2");

        p.CheckStatus();
        t.CheckStatus();
        k.CheckStatus();

        //t.Drink();
        k.SayGradeLevel();
    }
}
