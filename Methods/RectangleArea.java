import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());
        rectangleArea(a,b);

    }
    public static void rectangleArea(int a, int b) {
        System.out.println(a*b);
    }
}
