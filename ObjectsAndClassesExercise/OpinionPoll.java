import java.util.Scanner;

public class OpinionPoll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int row = 1; row <= n ; row++) {
            String data = sc.nextLine();
            String name = data.split(" ")[0];
            int age =Integer.parseInt(data.split(" ")[1]);
            if(age >30) {
                System.out.printf("%s - %d%n",name,age);
            }
        }
    }
}
