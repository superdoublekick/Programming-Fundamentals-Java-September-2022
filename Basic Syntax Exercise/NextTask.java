import java.util.Scanner;

public class NextTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int beginNum = scanner.nextInt();
        int endNum = scanner.nextInt();
        int sum = 0;


        for(int i = beginNum; i<=endNum; i++) {
            System.out.println(i);
            sum +=i;
        }
        System.out.printf("%nSum: %d",sum);
    }
}
