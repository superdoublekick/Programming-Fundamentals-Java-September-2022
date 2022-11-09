import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] wordsArr = sc.nextLine().split(" ");
        List<String> repeatList = new ArrayList<>();
        for (int i = 0; i <wordsArr.length ; i++) {
            String currentWord = wordsArr[i];
            int length = currentWord.length();
            String repeatString = repeatString(currentWord, length);
            repeatList.add(repeatString);

        }
        System.out.println(String.join("",repeatList));
     }
     public static String repeatString(String word,int count) {
         String result = "";
         for (int i = 0; i < count; i++) {
             result = result + word;
         }
         return result;
     }
}
