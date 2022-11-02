import java.util.Arrays;
import java.util.Scanner;
import java.util.ServiceConfigurationError;
import java.util.stream.Collectors;

public class WordFilter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] wordsArr = Arrays.stream(sc.nextLine().split(" ")).filter(w -> w.length() % 2 == 0).toArray(String[]::new);

        System.out.println(String.join(System.lineSeparator(), wordsArr));

    }
    static boolean evenWord(String s) {
        return s.length() % 2 == 0;
    }
}
