import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char firstSymbol = sc.nextLine().charAt(0);
        char secSymbol = sc.nextLine().charAt(0);

        printCharacters(firstSymbol, secSymbol);
    }

    public static void printCharacters(char start, char end) {
        if(start<end){
            for (int index = start+1; index < end; index++) {
                System.out.print((char) index + " ");
            }
        } else if (start>=end) {
            for (int index = end+1; index < start; index++) {
                System.out.print((char) index + " ");
            }
        }

    }
}
