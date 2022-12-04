import java.io.FilterOutputStream;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SecondTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inputsCount = Integer.parseInt(sc.nextLine());
        String regex = "^(?<tag>(?:\\$)([A-Z][a-z]{3,})(?:\\$)|(?:\\%)([A-Z][a-z]{3,})(?:\\%)): \\[(?<firstNums>[0-9]*)\\]\\|\\[(?<secNums>[0-9]*)\\]\\|\\[(?<ThirdNums>[0-9]*)\\]\\|$";
        Pattern pattern = Pattern.compile(regex);

        for (int i = 0; i <inputsCount ; i++) {
            String input = sc.nextLine();
            Matcher matcher = pattern.matcher(input);
            if(!matcher.find()) {
                System.out.println("Valid message not found!");
            } else {
                matcher.reset();
            }
            while (matcher.find()) {
                String tag = matcher.group("tag");
                String realTagName = tag.substring(1, tag.length()- 1);
                String firstNums = matcher.group("firstNums");
                String secNums = matcher.group("secNums");
                String thirdNums = matcher.group("ThirdNums");
                if(tag.isEmpty() || firstNums.isEmpty() || secNums.isEmpty() || thirdNums.isEmpty() ) {
                    System.out.println("Valid message not found!");
                    continue;
                }

                StringBuilder wholeWord = new StringBuilder();
                int first = Integer.parseInt(firstNums);
                int second = Integer.parseInt(secNums);
                int third = Integer.parseInt(thirdNums);
                char firstChar = (char) first;
                char secChar = (char) second;
                char thirdChar = (char) third;
                wholeWord.append(firstChar);
                wholeWord.append(secChar);
                wholeWord.append(thirdChar);
                System.out.printf("%s: %s%n", realTagName, wholeWord);



            }

        }
    }
}