import javax.print.DocFlavor;
import java.util.Scanner;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int countBrOne = 0;
        int countBrTwo = 0;
        boolean isBalanced = true;
        String lastBracket = "";
        for (int i = 0; i <n ; i++) {
            String input = sc.nextLine();
            if(!input.equals("(") && !input.equals(")")){
                continue;
            }
            if((lastBracket == "" && input.equals(")")) || lastBracket.equals(input)){
                isBalanced = false;
                break;
            }
            lastBracket= input;

            while(!input.equals("(")){
                break;

            }
            if(input.equals("(")){
                countBrOne++;
            }
            while (!input.equals(")")) {
                break;
            }
            if(input.equals(")")) {
                countBrTwo++;
            }

        }

        if(Math.abs(countBrTwo)>Math.abs(countBrOne)){
            System.out.println("UNBALANCED");
        }else if (Math.abs(countBrTwo)==Math.abs(countBrOne) && isBalanced) {
            System.out.println("BALANCED");
        }else{
            System.out.println("UNBALANCED");
        }

    }
}
