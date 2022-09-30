import java.util.Scanner;

public class SnowBall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int result = 1;

        int maxQuality = Integer.MIN_VALUE;
        int currentSnow = 0;
        int currentTime = 0;
        int currentQuality = 0;
        for (int i = 0; i <n ; i++) {
            int snowballSnow = Integer.parseInt(sc.nextLine());
            int snowballTime = Integer.parseInt(sc.nextLine());
            int snowballQuality = Integer.parseInt(sc.nextLine());


            result = (int) Math.pow(snowballSnow/snowballTime, snowballQuality);
            if(result>maxQuality) {
                maxQuality = result;
                currentSnow = snowballSnow;
                currentQuality = snowballQuality;
                currentTime = snowballTime;
            }
        }
        System.out.printf("%d : %d = %d (%d)",currentSnow, currentTime,maxQuality,currentQuality);

    }
}
