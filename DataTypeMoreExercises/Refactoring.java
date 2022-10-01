import java.util.Scanner;

public class Refactoring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ___Do___ = Integer.parseInt(sc.nextLine());

        for (int i = 2; i <= ___Do___; i++) {

            boolean isValid = true;

            for (int j = 2; j < i; j++) {

                if (i% j == 0) {

                    isValid = false;

                    break;

                }

            }

            System.out.printf("%d -> %b%n", i, isValid);
        }
    }
}