import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        int a =Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());

        calcuating(input,a,b);
    }
    public static void calcuating(String text,int a, int b) {
        int result = 0;
        switch (text){
            case "add":
                result = a + b;
                System.out.println(result);

                break;
            case "multiply":

                result =a*b;
                System.out.println(result);
                break;
            case "subtract":

                result = a -b;
                System.out.println(result);
                break;
            case "divide":
                result =a/b;
                System.out.println(result);

                break;
        }

    }
}
