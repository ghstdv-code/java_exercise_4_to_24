package chapter22;

public class Students {
    private String fname, lname, course;
    private int year;
    private char section;

    Students(String fname, String lname, String course, int year, char section){
        this.fname = fname;
        this.lname = lname;
        this.course = course;
        this.year = year;
        this.section = section;
    }

    void introduceSelf(){
        var sb = new StringBuilder();
        sb.append(String.format("Full Name           : %s %s\n",fname, lname ));
        sb.append(String.format("Course/Year/Section : %s/%d/%c\n",this.course, this.year, this.section));
        System.out.println(sb.toString());
    }
}
