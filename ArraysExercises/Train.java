import java.util.Arrays;
import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int[] arrayNums = new int[n];
        int sum = 0;
        for (int i = 0; i <n ; i++) {
            int currentNum = Integer.parseInt(sc.nextLine());

            sum+= currentNum;
            arrayNums[i] = currentNum;
        }
        for (int i = 0; i <arrayNums.length ; i++) {
            System.out.print(arrayNums[i] + " ");
        }
        System.out.printf("%n" + sum);
    }
}
