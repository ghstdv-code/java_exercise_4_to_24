package chapter15;

public class Student {
    String firstName, lastName, course, year, section;
    float midtermGrade, finalGrade;

    Student(String fname, String lname, String year, String course, String section, float midGrade, float finalGrade){
        this.firstName = fname;
        this.lastName = lname;
        this.year = year;
        this.course = course;
        this.section = section;
        this.midtermGrade = midGrade;
        this.finalGrade = finalGrade;
    }

    void IntroduceSelf(){
        var sb = new StringBuilder();
        sb.append(String.format("Full Name : %s %s\n", this.firstName, this.lastName));
        sb.append(String.format("Course    : %s\n", this.course));
        sb.append(String.format("Year      : %s\n", this.year));
        sb.append(String.format("Section   : %s\n", this.section));
        System.out.println(sb.toString());
    }

    void EvaluateGrade(){
        float ave = (midtermGrade +  finalGrade) / 2;
        String remark = "";

        if(ave > 100 || ave <= 0) remark = "Invalid Grade";
        else if(ave >= 98) remark = "With Highest Honors";
        else if(ave >= 95) remark = "With High Honors";
        else if(ave >= 90) remark = "With Honors";
        else if(ave >= 75) remark = "Passed";
        else remark = "Failed";


        var sb = new StringBuilder();
        sb.append(String.format("Full Name : %s %s\n", this.firstName, this.lastName));
        sb.append(String.format("Average   : %.2f\n", ave));
        sb.append(String.format("Remarks   : %s\n", remark));
        System.out.println(sb.toString());     
    }
}
