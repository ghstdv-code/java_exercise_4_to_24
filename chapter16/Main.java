package chapter16;

public class Main {
    public static void main(String[] args) {
        var user = new User(5213, "blackwiz", "Gernel", "Esguerra");
        user.setUserId(9854);

        var sb = new StringBuilder();
        sb.append(String.format("UserID    : %d\n", user.getUserId()));
        sb.append(String.format("Full Name : %s\n", user.getFullName()));
        sb.append(String.format("Username  : %s\n", user.getUsername()));
        System.out.println(sb.toString());
    }
}
