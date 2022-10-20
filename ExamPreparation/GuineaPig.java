import java.util.Scanner;

public class GuineaPig {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double foodKg = Double.parseDouble(sc.nextLine());
        double hayKg = Double.parseDouble(sc.nextLine());
        double coverKg = Double.parseDouble(sc.nextLine());
        double weightKg = Double.parseDouble(sc.nextLine());

        double foodGr = foodKg * 1000;
        double hayGr = hayKg * 1000;
        double coverGr = coverKg * 1000;
        double weightGr = weightKg * 1000;

        boolean isNotEnough = false;
        for (int day = 1; day <= 30; day++) {

            foodGr -= 300;
            if (day % 2 == 0) {
                double currentHay = foodGr * 0.05;
                hayGr = hayGr - currentHay;
            }
            if (day % 3 == 0) {
                double currentCover = weightGr / 3;
                coverGr = coverGr - currentCover;
            }
            if (foodGr <= 0 || hayGr <= 0 || coverGr <= 0) {
                isNotEnough = true;
                break;
            }
        }
        if (isNotEnough) {
            System.out.println("Merry must go to the pet store!");
        } else {
            System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.", foodGr / 1000, hayGr / 1000, coverGr / 1000);
        }
    }
}