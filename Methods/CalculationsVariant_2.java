import java.util.Scanner;

public class CalculationsVariant_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());
        switch (input) {
            case "add":
                add(a,b);
                break;
            case "multiply":
                multiply(a,b);
                break;
            case "subtract":
                subtract(a,b);
                break;
            case "divide":
                divide(a,b);
                break;
        }
    }
    public static void add(int a, int b) {
        System.out.println(a+b);
    }
    public static void subtract(int a, int b) {
        System.out.println(a-b);
    }
    public static void multiply(int a, int b) {
        System.out.println(a*b);
    }
    public static void divide(int a, int b) {
        System.out.println(a/b);
    }
}
