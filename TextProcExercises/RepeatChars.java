import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RepeatChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        char[] strCharArr = str.toCharArray();
        List<Character> endResult = new ArrayList<>();
        for (int i = 0; i <str.length() ; i++) {

            if(i == str.length() - 1) {
                endResult.add(strCharArr[i]);
                break;
            }
            if(strCharArr[i] == strCharArr[i + 1]) {
                continue;
            }else {
                endResult.add(strCharArr[i]);
            }
        }
        for(char a:endResult) {
            System.out.print(a);
        }
    }

}
