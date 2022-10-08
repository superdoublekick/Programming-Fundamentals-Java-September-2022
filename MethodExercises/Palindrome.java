import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        while (!input.equals("END")) {

            printPalindrome(input);

            input = sc.nextLine();
        }
    }
    public static void printPalindrome(String number) {
        String reversed = "";
        for (int i = number.length() -1; i >=0 ; i--) {
            reversed += number.charAt(i);
        }
        if(number.equals(reversed)) {
            System.out.println("true");
        }else {
            System.out.println("false");
        }

    }
}
