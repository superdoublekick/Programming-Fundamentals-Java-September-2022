import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ManipulationLists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String lineInput = sc.nextLine();

        while (!lineInput.equals("end")) {
            String[] commandArr = lineInput.split(" ");
            String command = commandArr[0];

            switch (command) {
                case "Add":
                    int numToAdd = Integer.parseInt(commandArr[1]);
                    numbers.add(numToAdd);
                    break;
                case "Remove":
                    int numToRemove = Integer.parseInt(commandArr[1]);
                    numbers.remove(Integer.valueOf(numToRemove));
                    break;
                case "RemoveAt":
                    int indexRemove = Integer.parseInt(commandArr[1]);
                    numbers.remove(indexRemove);
                    break;
                case "Insert":
                    int numToInsert = Integer.parseInt(commandArr[1]);
                    int indexToInsert = Integer.parseInt(commandArr[2]);
                    numbers.add(indexToInsert, numToInsert);
                    break;
            }
            lineInput = sc.nextLine();

        }
        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));

    }
}
