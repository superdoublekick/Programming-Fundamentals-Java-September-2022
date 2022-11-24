import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PlantDiscovery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        Map<String, Integer>  plantRarityMap = new HashMap<>();
        Map<String, Double> rateMap = new HashMap<>();

        for (int i = 1; i <=n ; i++) {
            String[] tokens = sc.nextLine().split("<->");
            String plant = tokens[0];
            int rarity = Integer.parseInt(tokens[1]);
            rateMap.put(plant, 0.0);

            plantRarityMap.put(plant, rarity);
        }

        String inputLine = sc.nextLine();
        while (!inputLine.equals("Exhibition")) {
            String[] tokens = inputLine.split("[: -]+");
            String command = tokens[0];
            String plant = tokens[1];

            double value = 0;

            if(!plantRarityMap.containsKey(plant)) {
                System.out.println("error");
            }else {
                switch (command) {
                    case "Rate":
                        double rate = Double.parseDouble(tokens[2]);
                        if(rateMap.get(plant) == 0) {
                            rateMap.put(plant, rate);
                        } else {
                            double newRate = (rateMap.get(plant) + rate)/2;
                            rateMap.put(plant, newRate);
                        }
                        break;
                    case "Update":
                        int rarity = Integer.parseInt(tokens[2]);

                        plantRarityMap.put(plant,rarity);

                        break;
                    case "Reset":
                        rateMap.put(plant, 0.0);


                        break;
                }
            }


            inputLine = sc.nextLine();

        }
        System.out.println("Plants for the exhibition: ");
        for (Map.Entry<String, Integer> entry : plantRarityMap.entrySet()) {
            System.out.printf("- %s; Rarity: %d; Rating: %.2f%n",entry.getKey(),entry.getValue(), rateMap.get(entry.getKey()));
        }

    }
}