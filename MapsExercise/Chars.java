import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Chars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine().replaceAll(" ", "");

        Map<Character, Integer> symbolsCount = new LinkedHashMap<>();
        for(char symbol:text.toCharArray()) {
            if(symbol == ' ') {
                continue;
            }
            if(!symbolsCount.containsKey(symbol)) {
                symbolsCount.put(symbol, 1);

            }
            else {
                int count = symbolsCount.get(symbol);
                symbolsCount.put(symbol, count + 1);
            }
        }
        symbolsCount.entrySet().forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));

    }
}