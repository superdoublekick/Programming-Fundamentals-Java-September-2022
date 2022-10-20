import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Inventory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> inventoryList = Arrays.stream(sc.nextLine().split(", ")).collect(Collectors.toList());

        String inputLine = sc.nextLine();

        while (!inputLine.equals("Craft!")) {
            String[] commandLine = inputLine.split(" - ");
            String command = commandLine[0];

            switch (command) {
                case "Collect":
                    String addItem = commandLine[1];
                    if(!inventoryList.contains(addItem)) {
                        inventoryList.add(addItem);
                    }
                    break;
                case "Drop":
                    String dropItem = commandLine[1];
                    inventoryList.remove(dropItem);
                    break;
                case "Combine Items":
                    String[] items = commandLine[1].split(":");
                    String oldItem = items[0];
                    String newItem = items[1];
                    if(inventoryList.contains(oldItem)) {
                        int indexOldItem = inventoryList.indexOf(oldItem);
                        inventoryList.add(indexOldItem + 1, newItem);
                    }

                    break;
                case "Renew":
                    String renewItem = commandLine[1];
                    if(inventoryList.contains(renewItem)) {
                        inventoryList.remove(renewItem);
                        inventoryList.add(renewItem);
                    }
                    break;
            }

            inputLine = sc.nextLine();
        }
        System.out.println(String.join(", ", inventoryList));
    }
}
