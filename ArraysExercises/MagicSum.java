import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbersArr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int magicSum = Integer.parseInt(sc.nextLine());
        for (int index = 0; index <=numbersArr.length -1 ; index++) {
            int currentNum = numbersArr[index];
            for (int inIndex = index + 1; inIndex <= numbersArr.length - 1 ; inIndex++) {
                int inNumber = numbersArr[inIndex];
                if(inNumber + currentNum == magicSum ){
                    System.out.println(currentNum + " " + inNumber);
                }
            }
            
        }
    }
}
