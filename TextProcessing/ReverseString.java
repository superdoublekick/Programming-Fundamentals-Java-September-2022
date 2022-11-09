import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();

        while (!word.equals("end")) {
            String reversedWord = "";
            for (int ch = word.length() - 1; ch >=0 ; ch--) {
                char c = word.charAt(ch);
                reversedWord+=c;

            }
            System.out.printf("%s = %s%n",word,reversedWord);



            word = sc.nextLine();
        }
    }
}