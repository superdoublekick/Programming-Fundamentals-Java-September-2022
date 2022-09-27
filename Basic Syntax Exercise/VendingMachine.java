import java.nio.charset.StandardCharsets;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        double sum = 0;
        double price = 0;

        while (!input.equals("Start")) {
            float coin = Float.parseFloat(input);
            if(Float.compare(coin, 0.1f) == 0 || Float.compare(coin, 0.2f) == 0 || Float.compare(coin, 0.5f) == 0 || Float.compare(coin, 1f) == 0 || Float.compare(coin, 2f) == 0) {
               sum += coin;
            } else {
                System.out.printf("Cannot accept %.2f%n", coin);
            }
            input = sc.nextLine();
        }
        input = sc.nextLine();
        while (!input.equals("End")) {

            switch (input) {
                case "Nuts":
                    price = 2.00;
                    sum = sum -price;
                    break;

                case "Water":
                    price = 0.70;
                    sum = sum -price;
                    break;

                case "Crisps":
                    price = 1.5;
                    sum -= price;
                    break;

                case "Soda":
                    price = 0.80;
                    sum -= price;
                    break;

                case "Coke":
                    price=  1.00;
                    sum -= price;
                    break;

                default:
                    System.out.println("Invalid product");
                    input = sc.nextLine();
                    continue;
            }
            if(sum < 0) {
                sum += price;
                System.out.println("Sorry, not enough money");
            } else  {
                System.out.printf("Purchased %s%n",input);
            }
            input = sc.nextLine();
        }

        if(sum>=0) {
            System.out.printf("Change: %.2f%n", sum);
        }
    }
}
