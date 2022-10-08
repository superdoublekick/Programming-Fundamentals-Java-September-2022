import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = Integer.parseInt(sc.nextLine());
        int num2 = Integer.parseInt(sc.nextLine());
        int num3 = Integer.parseInt(sc.nextLine());

        int sumOfNumbers = sum(num1,num2);
        int subtractOfNumbers =subtract(sumOfNumbers,num3);
        System.out.println(subtractOfNumbers);
    }
    public static int sum(int n1, int n2) {

        return n1 + n2;
    }
    public static int subtract(int n1, int n2) {
        return n1 - n2;
    }
}
