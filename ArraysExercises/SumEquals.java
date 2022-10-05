import java.util.Arrays;
import java.util.Scanner;

public class SumEquals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int sumLeft = 0;
        int sumInRight = 0;
        boolean isEqual = false;
        for (int i = 0; i < numbers.length ; i++) {
            int sumRight = 0;
            for (int j = i+1; j < numbers.length ; j++) {
                sumRight+= numbers[j];
            }
            if(sumLeft == sumRight) {
                System.out.println(i);
                isEqual = true;
                break;
            }
            sumInRight = sumRight;

            sumLeft += numbers[i];
        }

        if(!isEqual) {
            System.out.println("no");
        }


    }
}
