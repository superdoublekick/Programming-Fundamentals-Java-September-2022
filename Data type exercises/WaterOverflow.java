import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int i =0; i<n; i++){
            int liters = scanner.nextInt();
            if(liters>255 || (liters+sum)>255) {
                System.out.println("Insufficient capacity!");

            } else {
                sum+= liters;

            }

        }
        System.out.println(sum);


    }
}
