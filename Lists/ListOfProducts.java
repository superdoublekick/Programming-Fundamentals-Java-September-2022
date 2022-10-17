import java.io.StringReader;
import java.util.*;

public class ListOfProducts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        List<String> productList = new ArrayList<>();

        for (int i = 0; i < n ; i++) {
            String product = sc.nextLine();

            productList.add(product);
        }
        Collections.sort(productList);

        for (int i = 0; i < productList.size() ; i++) {
            System.out.println(i + 1 + "." + productList.get(i));
        }
    }
}
