import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class RotatingArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbersArr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int rotationCount = Integer.parseInt(sc.nextLine());

        for (int rotation = 1; rotation <=rotationCount ; rotation++) {

            int firstElement = numbersArr[0];
            for (int index = 0; index <numbersArr.length -1 ; index++) {

                numbersArr[index] = numbersArr[index+1];
            }
            numbersArr[numbersArr.length-1] = firstElement;
        }
        for (int number :numbersArr) {

            System.out.print(number + " ");
        }
    }
}
