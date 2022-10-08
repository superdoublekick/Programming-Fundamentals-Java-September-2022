import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        int count = Integer.parseInt(sc.nextLine());

        switch (input) {

            case "coke":

                calculator(1.40,count);
                break;
            case "water":

                calculator(1.00,count);
                break;
            case "coffee":

                calculator(1.50,count);
                break;
            case "snacks":

                calculator(2.00,count);
                break;
        }
    }
    public static void calculator(double calc,int counting) {
        System.out.printf("%.2f",calc*counting);
    }
}
