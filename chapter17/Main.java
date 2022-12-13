package chapter17;

public class Main {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        var emp = new Employee("Gernel", "Esguerra", "Tambay", "Atimonan", "Male", 22);
        var emp1 = new Employee("Gernel", "Esguerra", "Tambay");
        @SuppressWarnings("unused")
        var emp2 = new Employee();

        System.out.println(emp1.fname);
    }
}
