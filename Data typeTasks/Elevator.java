import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int p = Integer.parseInt(sc.nextLine());

        int countCourses =0;
        if(n%p>=1) {
            countCourses+=1;
        }
         if (n <= p) {

            countCourses=1;
        } else {
            countCourses += (int) Math.ceil(n/p);
        }
        System.out.println(countCourses);
    }
}
