import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int group = Integer.parseInt(scanner.nextLine());
        String typeOfPerson = scanner.nextLine();
        String weekDay = scanner.nextLine();
        double price = 0;
        double sum = 0;

        if(typeOfPerson.equals("Students")) {

            if(weekDay.equals("Sunday")) {
                price = 10.46;
                sum = price*group;
            }
            if(weekDay.equals("Saturday")) {
                price = 9.80;
                sum = price*group;
            }
            if(weekDay.equals("Friday")) {
                price = 8.45;
                sum = price*group;
            }
            if(group>=30) {
                sum = sum*0.85;

            }
        }
        else if(typeOfPerson.equals("Business")) {
            if(weekDay.equals("Sunday")) {
                price = 16;
                sum = price*group;
            }
            if(weekDay.equals("Saturday")) {
                price = 15.60;
                sum = price*group;
            }
            if(weekDay.equals("Friday")) {
                price = 10.90;
                sum = price*group;
            }
            if(group>=100) {
                sum = sum - 10*price;
            }
        }
        else if(typeOfPerson.equals("Regular")) {
            if(weekDay.equals("Sunday")) {
                price = 22.5;
                sum = price*group;
            }
            if(weekDay.equals("Saturday")) {
                price = 20;
                sum = price*group;
            }
            if(weekDay.equals("Friday")) {
                price = 15;
                sum = price*group;
            }
            if(group>=10 && group<=20) {
                sum = sum*0.95;
            }
        }
        System.out.printf("Total price: %.2f",sum);


    }
}
