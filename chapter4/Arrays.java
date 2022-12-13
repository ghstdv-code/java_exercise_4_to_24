package chapter4;

public class Arrays{
    public static void main(String[] args) {
        String emails[] = {"tdvvctx@yahoo.com", "gust786@gmail.com", "user46372@gmail.com"};
        String usernames[] = {"paa632", "gustiness786", "user46372"};
        String passwords[] = {"creative", "wincda32", "userdfault"};
        
        byte id = 2;
        var sb = new StringBuilder();
        sb.append("Index    : " + id + '\n');
        sb.append("Email    : " + emails[id]  + '\n');
        sb.append("Username : " + usernames[id] + '\n');
        sb.append("Password : " + passwords[id] + '\n');
        System.out.println(sb.toString());
    }
}