import java.util.Scanner;

public class PasswordReset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String password = sc.nextLine();
        String command = sc.nextLine();

        while (!command.equals("Done")) {

            if(command.equals("TakeOdd")) {
                password = getCharsOnOddInd(password);
                System.out.println(password);
            } else if (command.contains("Cut")) {
                String[] commandArr = command.split("\\s+");
                int index = Integer.parseInt(commandArr[1]);
                int length = Integer.parseInt(commandArr[2]);

                String substringToRemove = password.substring(index,index + length);
                password = password.replaceFirst(substringToRemove, "");
                System.out.println(password);
                
            } else if (command.contains("Substitute")) {
                String subString = command.split("\\s+")[1];
                String substitute = command.split("\\s+")[2];
                if(password.contains(subString)) {
                    password = password.replaceAll(subString, substitute);
                    System.out.println(password);
                } else {
                    System.out.println("Nothing to replace!");
                }
            }


            command = sc.nextLine();
        }
        System.out.printf("Your password is: %s",password);
    }
    public static String getCharsOnOddInd(String pass) {
        StringBuilder newPassword = new StringBuilder();
        for (int i = 0; i < pass.length() ; i++) {
            if(i % 2 != 0 ) {
                char currentSymbol = pass.charAt(i);
                newPassword.append(currentSymbol);
            }
        }
        return newPassword.toString();
    }
}