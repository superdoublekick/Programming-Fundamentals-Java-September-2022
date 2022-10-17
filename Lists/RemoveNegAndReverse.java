import java.util.*;
import java.util.stream.Collectors;

public class RemoveNegAndReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        numbers.removeIf(e -> e < 0);
        Collections.reverse(numbers);

        if(numbers.size() == 0) {
            System.out.println("empty");
        }else {
            System.out.println(numbers.toString().replaceAll("[\\[\\],]",""));
        }
    }
}
