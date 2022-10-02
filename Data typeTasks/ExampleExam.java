import java.util.Scanner;

public class ExampleExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int power = Integer.parseInt(scanner.nextLine());
        int distance = scanner.nextInt();
        int factor = scanner.nextInt();

        int countPoke = 0;
        int firstPower = power;

        while (power >= distance) {

            power -= distance;
            countPoke++;
            if(power == firstPower / 2) {
                if(factor != 0) {
                    power = power / factor;
                }

            }
        }
        System.out.println(power);
        System.out.println(countPoke);

    }
}
