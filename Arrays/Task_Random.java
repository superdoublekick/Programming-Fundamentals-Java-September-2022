import java.util.Arrays;
import java.util.Scanner;

public class Task_Random {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] firstArr = Arrays
                .stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] secondArr = Arrays
                .stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int sum = 0;
        int diffIndex = 0;
        boolean isIdentical = true;
        for (int i = 0; i <firstArr.length ; i++) {
            int firstNum = firstArr[i];
            int secondNum = secondArr[i];
            if(firstNum == secondNum){

                sum+= firstNum;
            }else {
                isIdentical = false;
                diffIndex = i;
                break;
            }
        }
        if(isIdentical) {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }else {
            System.out.printf("Arrays are not identical. Found difference at %d index.",diffIndex);
        }



    }
}
