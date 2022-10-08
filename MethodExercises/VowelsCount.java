import java.util.Locale;
import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        printVowelsCount(input.toLowerCase());

    }
    public static void printVowelsCount(String word) {
        int count = 0;
        for (char symbol:word.toCharArray()) {
            if(symbol == 'a' || symbol == 'e' || symbol == 'i' || symbol == 'o' || symbol == 'u') {
                count++;
            }
        }
        System.out.println(count);
    }
}

