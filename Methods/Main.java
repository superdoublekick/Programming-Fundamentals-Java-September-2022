import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numInput = Integer.parseInt(sc.nextLine());

        printNumbersSign(numInput);
    }
    public static  void printNumbersSign(int num) {
        if(num<0) {
            System.out.printf("The number %d is negative.",num);
        } else if (num>0) {
            System.out.printf("The number %d is positive.",num);
        } else {
            System.out.printf("The number %d is zero.",num);
        }
    }
}