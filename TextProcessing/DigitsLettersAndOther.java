import java.util.Scanner;
import java.util.ServiceConfigurationError;

public class DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();
        StringBuilder digitSb = new StringBuilder();
        StringBuilder letterSb = new StringBuilder();
        StringBuilder otherSb = new StringBuilder();
        for (int i = 0; i <text.length() ; i++) {
            char symbol = text.charAt(i);
            if(Character.isDigit(symbol)) {
                digitSb.append(symbol);
            } else if (Character.isLetter(symbol)) {
                letterSb.append(symbol);
            }
            else {
                otherSb.append(symbol);
            }
        }
        System.out.println(digitSb);
        System.out.println(letterSb);
        System.out.println(otherSb);
    }
}
