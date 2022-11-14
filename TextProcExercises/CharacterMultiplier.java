import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        String firstString = input[0];
        String secString = input[1];
        char[] charArrFirstString = firstString.toCharArray();
        char[] charArrSecString = secString.toCharArray();

        int sum = 0;
        if (firstString.length() > secString.length()) {
            for (int i = 0; i < firstString.length(); i++) {
                if (i < secString.length()) {
                    sum += charArrFirstString[i] * charArrSecString[i];
                } else {
                    sum += charArrFirstString[i];
                }


            }
        } else if (secString.length() > firstString.length()) {
            for (int i = 0; i < secString.length(); i++) {
                if (i < firstString.length()) {
                    sum += charArrFirstString[i] * charArrSecString[i];
                } else {
                    sum += charArrSecString[i];
                }


            }
        } else {
            for (int i = 0; i < firstString.length(); i++) {
                if (i < firstString.length()) {
                    sum += charArrFirstString[i] * charArrSecString[i];
                }

            }
        }
        System.out.println(sum);
    }
}
