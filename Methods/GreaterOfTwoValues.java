import java.util.Scanner;

public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String type = sc.nextLine();

        switch (type) {
            case "int":
                int firstNum = Integer.parseInt(sc.nextLine());
                int secondNum = Integer.parseInt(sc.nextLine());

                System.out.println(getMax(firstNum,secondNum));
                break;
            case "char":
                char firstChar = sc.nextLine().charAt(0);
                char secChar = sc.nextLine().charAt(0);
                System.out.println(getMax(firstChar,secChar));
                break;
            case "string":
                String firstStr = sc.nextLine();
                String secStr = sc.nextLine();
                System.out.println(getMax(firstStr,secStr));
                break;

        }
    }
    public static int getMax(int firstNum, int secNum) {
        if(firstNum>secNum) {
            return firstNum;
        }else {
            return secNum;
        }
    }
    public static char getMax(char firstSymbol, char secSymbol) {
        if(firstSymbol>secSymbol) {
            return firstSymbol;
        }else {
            return secSymbol;
        }
    }
    public static String getMax(String firstText, String secText) {

        if(firstText.compareTo(secText) > 0) {
            return firstText;
        } else {
            return secText;
        }
    }
}
