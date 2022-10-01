import java.util.Scanner;

public class FloatingEquality {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = Double.parseDouble(sc.nextLine());
        double b = Double.parseDouble(sc.nextLine());


        if(Math.abs(a-b)<=0.000001) {
            System.out.println("True");


        }else {
            System.out.println("False");
        }
    }
}
