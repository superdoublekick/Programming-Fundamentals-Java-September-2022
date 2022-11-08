import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        Map<String, Double> productsPrice = new LinkedHashMap<>();
        Map<String, Integer> productsCount = new LinkedHashMap<>();

        while (!input.equals("buy")) {
            String product = input.split(" ")[0];
            double price = Double.parseDouble(input.split(" ")[1]);
            int count = Integer.parseInt(input.split(" ")[2]);
            productsPrice.put(product,price);
            if(!productsCount.containsKey(product)) {
                productsCount.put(product,count);
            }else {
                productsCount.replace(product, productsCount.get(product) + count);
            }


            input = sc.nextLine();
        }
        for(Map.Entry<String, Double> entry : productsPrice.entrySet()) {
            String productName = entry.getKey();
            double finalSum = entry.getValue() * productsCount.get(productName);
            System.out.printf("%s -> %.2f%n", productName, finalSum);
        }
    }
}
