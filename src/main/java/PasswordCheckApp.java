import java.util.regex.*;

public class PasswordCheckApp {

    public static void main(String[] args) {
        System.out.println(passwordLength("bvzuezwg78"));
        System.out.println(passwordNumbers("bvzuezwg78"));
        System.out.println(passwordLetters("bvzuezwg78"));
    }


    public static boolean passwordListCheck(String[] passwords){
        for(String pw: passwords) {
            if (passwordCheck(pw) == false) {
                return false;
            }
        }
        return true;
    }

    public static boolean passwordCheck(String password){
        return passwordLength(password) && passwordNumbers(password) && passwordLetters(password);
    }

    public static boolean passwordLength(String password){
        return password.length() > 7;
    }

    public static boolean passwordNumbers(String password){
        Pattern p1 = Pattern.compile("[0-9]");
        Matcher m1 = p1.matcher(password);
        return m1.find();
    }

    public static boolean passwordLetters(String password){
        Pattern p1 = Pattern.compile("[a-z]");
        Pattern p2 = Pattern.compile("[A-Z]");
        Matcher m1 = p1.matcher(password);
        Matcher m2 = p2.matcher(password);
        return m1.find() || m2.find();
    }

    public static boolean passwordNumbers2(String password){
        //return password.matches(".*[0-9]");
        return password.contains(".*\\d.*");
    }



    /* Password check function which was googled by jonas

    String pattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}";
      System.out.println(passwd.matches(pattern));

    public static boolean passwordLetters(String password){
        return password.contains()
    }
    */




}
