import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(sc.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        int maxCapacity = Integer.parseInt(sc.nextLine());
        String command = sc.nextLine();

        while (!command.equals("end")) {
            String[] commandArr = command.split("\\s+");
            if(command.contains("Add")) {
                numbers.add(Integer.parseInt(commandArr[1]));
            }else {
                int numOfPassengers = Integer.parseInt(commandArr[0]);
                for (int i = 0; i <numbers.size() ; i++) {
                    int currentNum = numbers.get(i);
                    if(numbers.get(i) + numOfPassengers <= maxCapacity) {
                        numbers.set(i, numOfPassengers + numbers.get(i));
                        break;
                    }
                }
            }
            command = sc.nextLine();
        }
        for (int num: numbers) {
            System.out.print(num + " ");
        }
    }
}
