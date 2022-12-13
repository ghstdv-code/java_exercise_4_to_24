package chapter18;

public class Toodler extends Person{

    String favGame;
    Toodler(String name, String sex, int age, String favGame){
        super(name, sex, age);
        this.favGame = favGame;
    }

    void Drink(){
        System.out.println(name + " Drinking Milk");
    }

    void CheckStatus(){
        super.CheckStatus();
        System.out.println("Favorite Game  : " + this.favGame);
    }
}
