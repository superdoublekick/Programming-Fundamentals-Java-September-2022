import java.sql.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class ChangeList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(sc.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String command = sc.nextLine();
        while (!command.equals("end")) {
            if(command.contains("Delete")) {
                int numberForRemove = Integer.parseInt(command.split(" ")[1]);
                numbers.removeAll(Arrays.asList(numberForRemove));
            } else if (command.contains("Insert")) {
                int element = Integer.parseInt(command.split(" ")[1]);
                int index = Integer.parseInt(command.split(" ")[2]);
                numbers.add(index, element);
            }


            command = sc.nextLine();
        }
        for (int num:numbers) {
            System.out.print(num + " ");
        }
    }
}