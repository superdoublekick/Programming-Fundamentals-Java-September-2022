import java.util.Scanner;
import java.util.ServiceConfigurationError;

public class TextFilter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] banWordsArr = sc.nextLine().split(", ");
        String text = sc.nextLine();

        for(String banWord: banWordsArr) {
            text = text.replace(banWord,repeatString("*",banWord.length()));

        }
        System.out.println(text);
    }
    public static String repeatString(String s, int count) {
        String result = "";
        for (int i = 0; i <count ; i++) {
            result += s;
        }
        return result;
    }
}
