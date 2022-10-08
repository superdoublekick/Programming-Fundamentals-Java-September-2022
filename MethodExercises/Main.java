import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOne = Integer.parseInt(sc.nextLine());
        int numTwo = Integer.parseInt(sc.nextLine());
        int numThree = Integer.parseInt(sc.nextLine());

        printSmallestNumber(numOne,numTwo,numThree);

    }
    public static void printSmallestNumber(int n1, int n2, int n3) {
        if(n1<=n2 && n1<=n3) {
            System.out.println(n1);
        } else if (n2<=n1 && n2<=n3) {
            System.out.println(n2);
        }else {
            System.out.println(n3);
        }
    }
}