import java.sql.PreparedStatement;
import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double raisedNum = Double.parseDouble(sc.nextLine());
        int raiser = Integer.parseInt(sc.nextLine());


        System.out.printf(new DecimalFormat("0.####").format(power(raisedNum,raiser)));
    }
    public static double power(double firstNum, int secondNum) {
        double result = 1;
        result = Math.pow(firstNum,secondNum);
        return result;
    }
}
