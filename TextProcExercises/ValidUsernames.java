import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] usernames = input.split(", ");

        for (String username: usernames) {

            if(ValidUser(username)) {
                System.out.println(username);
            }
        }
    }
    public static boolean ValidUser(String user) {
        boolean isValidLength = user.length()>=3 && user.length()<=16;
        boolean isValidName = false;
        for (char u: user.toCharArray()) {
            if(!Character.isLetterOrDigit(u) && u != '-' && u != '_') {
                return false;
            }

        }
        isValidName = true;
        return isValidLength && isValidName;

    }
}