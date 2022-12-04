import java.util.*;
import java.util.regex.Matcher;

public class ThirdTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, List<String>> words = new LinkedHashMap<>();
        String[] input = sc.nextLine().split(" \\| ");

        for (String wordAndDef : input) {
            String[] defs = wordAndDef.split(": ");

            if(!words.containsKey(defs[0])) {
                words.put(defs[0], new ArrayList<>());
            }
            words.get(defs[0]).add(defs[1]);

        }
        String[] print = sc.nextLine().split(" \\| ");

        List<String> teacherWords = new ArrayList<>();
        for (int i = 0; i <print.length ; i++) {
            teacherWords.add(print[i]);
        }
        String command = sc.nextLine();
        if(command.contains("Hand Over")) {
            for (String word: words.keySet()) {
                System.out.print(word + " ");
            }
        } else if (command.equals("Test")) {
            teacherWords.forEach(word -> {
                if(words.containsKey(word)) {
                    System.out.printf("%s:%n",word);
                    words.get(word).forEach((d) -> {
                        System.out.printf(" -%s%n",d);
                    });
                }
            });
        }
    }
}

