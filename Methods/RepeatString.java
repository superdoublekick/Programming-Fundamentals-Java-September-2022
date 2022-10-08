import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int repeatTimes = Integer.parseInt(sc.nextLine());

        System.out.println(repeatString(word,repeatTimes));
    }
    public static String repeatString(String text, int count) {
        String result = "";
        for (int i = 0; i <count ; i++) {
            result += text;
        }
        return result;
    }
}
