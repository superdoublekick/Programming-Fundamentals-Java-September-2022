import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PokemonDontGo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sumOfRemovedEl = 0;
        List<Integer> numbers = Arrays.stream((sc.nextLine().split("\\s+"))).map(Integer::parseInt).collect(Collectors.toList());
        while (numbers.size() > 0) {
            int index = Integer.parseInt(sc.nextLine());
            if (index >= 0 && index <= numbers.size() - 1) {
                int removedElement = numbers.get(index);
                sumOfRemovedEl +=removedElement;
                numbers.remove(index);
                modifyList(numbers, removedElement);
            } else if (index < 0) {
                int firstElement = numbers.get(0);
                sumOfRemovedEl += firstElement;
                numbers.remove(0);
                int lastElement = numbers.get(numbers.size() - 1);
                numbers.add(0, lastElement);
                modifyList(numbers, firstElement);
            } else if (index > numbers.size() -1) {
                int lastElement = numbers.get(numbers.size() - 1);
                sumOfRemovedEl += lastElement;
                numbers.remove(numbers.size() - 1);
                int firstElement = numbers.get(0);
                numbers.add(firstElement);
                modifyList(numbers, lastElement);
            }
        }
        System.out.println(sumOfRemovedEl);
    }

    private static void modifyList(List<Integer> numbers, int removedElement) {
        for (int index = 0; index <= numbers.size() - 1; index++) {
            int currentNum = numbers.get(index);
            if (currentNum <= removedElement) {
                currentNum += removedElement;
            } else {
                currentNum -= removedElement;
            }
            numbers.set(index, currentNum);
        }
    }
}

