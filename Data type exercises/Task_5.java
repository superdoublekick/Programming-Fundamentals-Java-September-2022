import java.util.Scanner;
import java.util.ServiceConfigurationError;

public class Task_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int startCode = sc.nextInt();
        int endCode = sc.nextInt();

        for (int code = startCode; code <= endCode ; code++) {
            System.out.print((char) code + " ");
        }

    }
}
