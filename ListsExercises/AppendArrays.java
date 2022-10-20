import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AppendArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        List<String> listArray = Arrays.stream(input.split("\\|")).collect(Collectors.toList());
        Collections.reverse(listArray);

        System.out.println(listArray.toString() //"[  7  8, 4 5 6 , 1 2 3 ]"
                .replace("[", "")
                .replace("]", "")
                .trim()
                .replaceAll(",", "")
                .replaceAll("\\s+", " "));
    }
}
