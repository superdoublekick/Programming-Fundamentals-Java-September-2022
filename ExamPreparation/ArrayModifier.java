import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbersArr = Arrays.stream(sc.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        String inputLine = sc.nextLine();
        while (!inputLine.equals("end")) {
            String[] commandArr = inputLine.split("\\s+");
            String command = commandArr[0];

            switch (command) {
                case "swap":
                    int swapIndexOne = Integer.parseInt(commandArr[1]);
                    int swapIndexTwo = Integer.parseInt(commandArr[2]);

                    int valueAtIndexOne = numbersArr[swapIndexOne];
                    int valueAtIndexTwo = numbersArr[swapIndexTwo];

                    numbersArr[swapIndexOne] = valueAtIndexTwo;
                    numbersArr[swapIndexTwo] = valueAtIndexOne;

                    break;
                case "multiply":
                    int multiplyIndexFirst = Integer.parseInt(commandArr[1]);
                    int multiplyIndexSecond = Integer.parseInt(commandArr[2]);
                    int multiply = numbersArr[multiplyIndexFirst] * numbersArr[multiplyIndexSecond];
                    numbersArr[multiplyIndexFirst] = multiply;
                    break;
                case "decrease":
                    for (int i = 0; i < numbersArr.length ; i++) {
                        numbersArr[i]= numbersArr[i] - 1;
                    }
                    break;
            }

            inputLine = sc.nextLine();
        }
        for (int i = 0; i <numbersArr.length ; i++) {
            if(i == numbersArr.length - 1) {
                System.out.println(numbersArr[i]);
            } else {
                System.out.print(numbersArr[i] + ", ");
            }
        }
    }
}
