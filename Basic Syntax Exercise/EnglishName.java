import java.util.Scanner;
import java.util.ServiceConfigurationError;

public class EnglishName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int lastD = 0;

        if(n%10 ==1) {
            System.out.println("one");
        } else if (n%10 ==2) {
            System.out.println("two");
        } else if (n%10 ==3) {
            System.out.println("three");
        }  else if (n%10 ==4) {
            System.out.println("four");
        } else if (n%10 ==5) {
            System.out.println("five");
        }  else if (n%10 ==6) {
            System.out.println("six");
        } else if (n%10 ==7) {
            System.out.println("seven");
        }  else if (n%10 ==8) {
            System.out.println("eight");
        } else if (n%10 ==9) {
            System.out.println("nine");
        }  else if (n%10 ==0) {
            System.out.println("zero");
        }
    }
}
