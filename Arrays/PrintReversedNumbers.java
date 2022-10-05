import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class PrintReversedNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int[] numbersArr = new int[n];
        for (int i = 0; i <numbersArr.length ; i++) {
            int currentNum = Integer.parseInt(sc.nextLine());
            numbersArr[i] = currentNum;
        }
        for (int i = numbersArr.length - 1; i >=0 ; i--) {

            System.out.printf("%d ",numbersArr[i]);
        }

    }
}
