import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] firstArray = sc.nextLine().split(" ");
        String[] secondArray = sc.nextLine().split(" ");

        for (int i = 0; i < secondArray.length; i++) {
            for (int j = 0; j <firstArray.length ; j++) {
                if(secondArray[i].equals(firstArray[j])) {
                    System.out.print(secondArray[i] + " ");
                } else {
                    continue;
                }
            }
        }
     }
}