import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Locale;
import java.util.Scanner;

public class ActivationKeys {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String activationKey = sc.nextLine();
        String inputLine = sc.nextLine();
        while (!inputLine.equals("Generate")) {
            String[] tokens = inputLine.split(">>>");
            String command = tokens[0];

            int startIndex = 0;
            int endIndex = 0;

            switch (command) {
                case "Contains":
                    String subString = tokens[1];

                    if(activationKey.contains(subString)) {
                        System.out.printf("%s contains %s%n", activationKey, subString);
                    } else  {
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip":
                    String upperOrLower = tokens[1];
                    startIndex = Integer.parseInt(tokens[2]);
                    endIndex = Integer.parseInt(tokens[3]);
                    subString = activationKey.substring(startIndex, endIndex);
                    if(upperOrLower.equals("Upper")) {
                        activationKey = activationKey.replace(subString, subString.toUpperCase());
                    } else {
                        activationKey = activationKey.replace(subString, subString.toLowerCase());
                    }
                    System.out.println(activationKey);

                    break;
                case "Slice":
                    startIndex = Integer.parseInt(tokens[1]);
                    endIndex = Integer.parseInt(tokens[2]);
                    subString = activationKey.substring(startIndex, endIndex);

                    activationKey = activationKey.replace(subString, "");

                    System.out.println(activationKey);
                    break;

            }
            inputLine = sc.nextLine();
        }
        System.out.printf("Your activation key is: %s%n", activationKey);
    }
}