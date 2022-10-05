import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbersArr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int sum = 0;
        for (int i = 0; i <numbersArr.length ; i++) {

            if(numbersArr[i]%2 ==0) {
                sum+=numbersArr[i];
            }
        }
        System.out.println(sum);
    }
}
