import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AdvancedManipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(sc.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        String command = sc.nextLine();

        while (!command.equals("end")) {
            String[] commandArr = command.split("\\s+");
            if(command.contains("Contains")) {
                int containedNum = Integer.parseInt(command.split("\\s+")[1]);
                if(numbers.contains(containedNum)) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No such number");
                }
            } else if (command.contains("Print even")) {
                for (int i = 0; i < numbers.size() ; i++) {
                    if(numbers.get(i) % 2 == 0) {
                        System.out.print(numbers.get(i) + " ");
                    }

                }
                System.out.println();

            } else if (command.contains("Print odd")) {
                for (int i = 0; i < numbers.size() ; i++) {
                    if(numbers.get(i) % 2 != 0) {
                        System.out.print(numbers.get(i) + " ");
                    }
                }
                System.out.println();

            } else if (command.contains("Get sum")) {
                int sum = 0;
                for (int i = 0; i < numbers.size() ; i++) {
                    sum += numbers.get(i);
                }
                System.out.println(sum);
            } else if (command.contains("Filter")) {
                String condition = commandArr[1];
                if(condition.equals(">")) {
                    for (int i = 0; i < numbers.size() ; i++) {
                        if(numbers.get(i) > Integer.parseInt(commandArr[2])) {
                            System.out.print(numbers.get(i) + " ");
                        }
                    }
                    System.out.println();
                } else if (condition.equals("<")) {
                    for (int i = 0; i < numbers.size() ; i++) {
                        if(numbers.get(i) < Integer.parseInt(commandArr[2])) {
                            System.out.print(numbers.get(i) + " ");
                        }
                    }
                    System.out.println();

                } else if (condition.equals(">=")) {
                    for (int i = 0; i < numbers.size() ; i++) {
                        if(numbers.get(i) >= Integer.parseInt(commandArr[2])) {
                            System.out.print(numbers.get(i) + " ");
                        }
                    }
                    System.out.println();
                } else if (condition.equals("<=")) {
                    for (int i = 0; i < numbers.size() ; i++) {
                        if(numbers.get(i) <= Integer.parseInt(commandArr[2])) {
                            System.out.print(numbers.get(i) + " ");
                        }
                    }
                    System.out.println();
                }
            }
            command = sc.nextLine();
        }
    }
    public static boolean isValidIndex(int index, List<Integer> numbers) {
        return index >= 0 && index <= numbers.size() - 1;
    }
}
