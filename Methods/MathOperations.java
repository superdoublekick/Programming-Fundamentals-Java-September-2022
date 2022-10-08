import java.text.DecimalFormat;
import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int firstNum = Integer.parseInt(sc.nextLine());
        String operator = sc.nextLine();
        int secNum = Integer.parseInt(sc.nextLine());

        System.out.printf(new DecimalFormat("0.####").format(calculate(firstNum,operator,secNum)));

    }
    public static double calculate(int a, String operator, int b) {
        double result = 0;

        switch (operator) {
            case "*":
                result = a*b;
                break;
            case "/":
                result = a/b;
                break;
            case "+":
                result = a+b;
                break;
            case "-":
                result = a - b;
                break;
        }
        return result;
    }
}
