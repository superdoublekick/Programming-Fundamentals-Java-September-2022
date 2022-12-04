import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String myString = sc.nextLine();

        String command = sc.nextLine();
        while (!command.equals("Done")) {
            String[] commandArr = command.split(" ");
            String currentCommand = commandArr[0];

            switch (currentCommand) {
                case "Change":
                    char symbolToBeChanged = (commandArr[1].charAt(0));
                    char replacement = commandArr[2].charAt(0);
                    for (int i = 0; i <myString.length() ; i++) {
                        if(myString.charAt(i) == symbolToBeChanged) {
                            myString = myString.replace(symbolToBeChanged, replacement);

                        }
                    }
                    System.out.println(myString);

                    break;
                case "Includes":
                    String substring = commandArr[1];
                    if(myString.contains(substring)) {
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }
                    break;
                case "End":
                    String subString = commandArr[1];
                    if(myString.endsWith(subString)) {
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }
                    break;
                case "Uppercase":
                    myString = myString.toUpperCase();
                    System.out.println(myString);
                    break;
                case "FindIndex":
                    char indexChar = commandArr[1].charAt(0);
                    for (int i = 0; i <myString.length() ; i++) {
                        if(myString.charAt(i) == indexChar) {
                            System.out.println(i);
                            break;
                        }
                    }
                    break;
                case "Cut":
                    int startIndex = Integer.parseInt(commandArr[1]);
                    int count = Integer.parseInt(commandArr[2]);

                    String newSubString = myString.substring(startIndex, startIndex + count);
                    System.out.println(newSubString);
                    break;
            }

            command = sc.nextLine();
        }
    }
}
