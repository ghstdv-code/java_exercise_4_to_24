package chapter16;

public class User {
    private int userId;
    private String username, fname, lname;

    User(int userid, String uname, String fname, String lname){
        this.userId = userid;
        this.username = uname;
        this.fname = fname;
        this.lname = lname;
    }

    void setUserId(int userid){
        this.userId = userid;
    }

    int getUserId(){
        return this.userId;
    }

    String getFullName(){
        return this.fname + " " + this.lname;
    }

    String getUsername(){
        return this.username;
    }
}
