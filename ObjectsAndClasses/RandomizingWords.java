import java.util.Random;
import java.util.Scanner;

public class RandomizingWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        String[] words = input.split("\\s+");

        Random rndGenerator = new Random();
        for (int i = 0; i < words.length ; i++) {
            int indexX = rndGenerator.nextInt(words.length);
            int indexY = rndGenerator.nextInt(words.length);
            String oldWordX = words[indexX];
            words[indexX] = words[indexY];
            words[indexY] = oldWordX;
        }
        System.out.println(String.join(System.lineSeparator(), words));
    }
}