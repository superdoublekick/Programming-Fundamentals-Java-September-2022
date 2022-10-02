import java.util.Scanner;

public class SnowBall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        long result = 1;

        long maxQuality = Long.MIN_VALUE;
        long currentSnow = 0;
        long currentTime = 0;
        long currentQuality = 0;
        for (int i = 0; i <n ; i++) {
            long snowballSnow = Long.parseLong(sc.nextLine());
            long snowballTime = Long.parseLong(sc.nextLine());
            long snowballQuality = Long.parseLong(sc.nextLine());


            result = (long) Math.pow(Math.abs(snowballSnow/snowballTime), snowballQuality);
            if(result>maxQuality) {
                maxQuality = result;
                currentSnow = snowballSnow;
                currentQuality = snowballQuality;
                currentTime = snowballTime;
            }
        }
        System.out.printf("%d : %d = %d (%d)", currentSnow, currentTime, maxQuality, currentQuality);

    }
}
