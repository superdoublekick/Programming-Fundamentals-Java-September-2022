import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String toRemove = sc.nextLine();
        String text = sc.nextLine();

        int index = text.indexOf(toRemove);
        while (index != -1) {
            text = text.replace(toRemove, "");
            index = text.indexOf(toRemove);
        }

        System.out.println(text);
    }
}
