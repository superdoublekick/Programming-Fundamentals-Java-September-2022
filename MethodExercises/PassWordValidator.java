import java.util.Scanner;

public class PassWordValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();

        if(!isValidLength(password)){
            System.out.println("Password must be between 6 and 10 characters");

        }if (!isValidLettersAndDigits(password)) {
            System.out.println("Password must consist only of letters and digits");
        } if(!isValid(password)) {
            System.out.println("Password must have at least 2 digits");
        }
        if(isValid(password) && isValidLength(password) && isValidLettersAndDigits(password)) {
            System.out.println("Password is valid");
        }
    }
    public static boolean isValid(String password) {
        if(true) {
            int count = 0;
            for (int i = 0; i <=9 ; i++) {

                String str1 = Integer.toString(i);

                if(password.contains(str1)) {
                    count++;
                }
            }
            if(count==0 || count == 1) {
                return false;
            }
        }
        return true;
    }
    public static boolean isValidLength(String password) {
        if(!(password.length()>=6 && password.length()<=10)) {
            return false;
        }
        return true;
    }
    public static boolean isValidLettersAndDigits(String password) {
        if ((password.contains("@") || password.contains("#")
                || password.contains("!") || password.contains("~")
                || password.contains("$") || password.contains("%")
                || password.contains("^") || password.contains("&")
                || password.contains("*") || password.contains("(")
                || password.contains(")") || password.contains("-")
                || password.contains("+") || password.contains("/")
                || password.contains(":") || password.contains(".")
                || password.contains(", ") || password.contains("<")
                || password.contains(">") || password.contains("?")
                || password.contains("|"))) {
            return false;
        }
        return true;
    }
}
