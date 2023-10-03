package practices;
import java.util.Scanner;

public class DiscountDistribution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of product types (N)
        int numOfProducts = scanner.nextInt();
        int[] orders = new int[numOfProducts];

        for (int i = 0; i < numOfProducts; i++) {
            orders[i] = scanner.nextInt();
        }

        int disAmount = scanner.nextInt();

        scanner.close();

        int countDiscountedProducts = 0;

        for (int i = 0; i < numOfProducts; i++) {
            if (orders[i] > 0 && disAmount % orders[i] == 0) {
                countDiscountedProducts++;
            }
        }
        System.out.println(countDiscountedProducts);
    }
}
