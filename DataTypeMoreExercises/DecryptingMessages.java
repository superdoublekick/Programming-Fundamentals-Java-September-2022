import java.util.Scanner;

public class DecryptingMessages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int key = Integer.parseInt(sc.nextLine());
        int letters = Integer.parseInt(sc.nextLine());

        String message ="";
        for (int i = 0; i < letters ; i++) {
            char letter = sc.nextLine().charAt(0);
            int decryptedLetterNumber = (int) letter +key;
            char decryptedLetter = (char) decryptedLetterNumber;
            message = message + decryptedLetter;
        }

        System.out.println(message);
    }
}
