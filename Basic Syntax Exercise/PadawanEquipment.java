import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float money = Float.parseFloat(sc.nextLine());
        int students = Integer.parseInt(sc.nextLine());
        float priceLightsabers = Float.parseFloat(sc.nextLine());
        float priceRobes = Float.parseFloat(sc.nextLine());
        float priceBelts = Float.parseFloat(sc.nextLine());



        double sum = 0;
        int beltStudents = 0;




        for (int i = 0; i <=students ; i++) {
            if(i%6 == 0) {
                    beltStudents++;
            }
        }

        sum = (priceLightsabers*(students + Math.ceil(students*0.1)) + priceRobes*students + priceBelts*(students - beltStudents + 1));
        if(money >= sum) {
            System.out.printf("The money is enough - it would cost %.2flv.",sum);

        } else {
            System.out.printf("George Lucas will need %.2flv more.", sum - money);
        }
    }
}
