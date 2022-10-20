import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(sc.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> bombNums = Arrays.stream(sc.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        int bombNum = bombNums.get(0);
        int power = bombNums.get(1);
        int sum = 0;
        for (int i = 0; i < numList.size() ; i++) {
            if(numList.get(i) == bombNum) {
                numList.set(i, 0);
                for (int j = 1; j <= power ; j++) {
                    if(i-j >= 0) {
                        numList.set(i-j, 0);
                    }
                    if (i + j <= numList.size() - 1) {
                        numList.set(i + j, 0);
                    }
                }
            }
        }
        for (int num: numList) {
            sum+=num;
        }
        System.out.println(sum);
    }
}
