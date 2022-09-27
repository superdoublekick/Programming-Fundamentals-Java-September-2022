import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lostGames = scanner.nextInt();
        double headsetPrice = scanner.nextDouble();
        double mousePrice = scanner.nextDouble();
        double keyboardPrice = scanner.nextDouble();
        double displayPrice = scanner.nextDouble();

        int countHeadset = lostGames/2;
        int countMouse = lostGames/3;
        int countKeyboard = lostGames/6;
        int countDisplay = lostGames/12;

        double finalSum = (countHeadset*headsetPrice) + (mousePrice*countMouse) + (countKeyboard*keyboardPrice) + (countDisplay*displayPrice);

        System.out.printf("Rage expenses: %.2f lv.",finalSum);
    }
}
