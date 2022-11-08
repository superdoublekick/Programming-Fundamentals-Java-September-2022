import java.util.*;
import java.util.Map;

public class MinerTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String resource = sc.nextLine();

        Map<String, Integer> resourcesQuantity = new LinkedHashMap<>();
        while (!resource.equals("stop")) {
            int quantity = Integer.parseInt(sc.nextLine());

            if(!resourcesQuantity.containsKey(resource)) {
                resourcesQuantity.put(resource, quantity);
            } else {
                int currentQuantity = resourcesQuantity.get(resource);
                resourcesQuantity.put(resource, currentQuantity + quantity);
            }
            resource = sc.nextLine();


        }
        resourcesQuantity.entrySet().forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));

    }
}
