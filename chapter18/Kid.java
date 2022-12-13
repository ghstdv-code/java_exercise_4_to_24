package chapter18;

public class Kid extends Toodler {
    String GradeLevel;
    Kid(String name, String sex, int age, String favGame, String GradeLevel){
        super(name, sex, age, favGame);
        this.GradeLevel = GradeLevel;
    }

    void SayGradeLevel(){
        System.out.println(GradeLevel);
    }
}
