import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int currentNum = 0;
        int rightNum = 0;
        int maxValue = Integer.MIN_VALUE;

        for (int i = 0; i <numbers.length ; i++) {
            boolean isItBigger = true;
            for (int j = i+1; j <numbers.length ; j++) {
                if(numbers[i] <= numbers[j]) {
                    isItBigger = false;
                }
            }
            if(isItBigger == true) {
                System.out.print(numbers[i] + " ");
            }


        }
        System.out.println();
    }
}
