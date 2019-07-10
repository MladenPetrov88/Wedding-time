import java.util.Scanner;

public class WeddingTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double whiskeyPrice = Double.parseDouble(scanner.nextLine());
        double water = Double.parseDouble(scanner.nextLine());
        double wine = Double.parseDouble(scanner.nextLine());
        double champagne = Double.parseDouble(scanner.nextLine());
        double whiskey = Double.parseDouble(scanner.nextLine());

        double champagnePrice = whiskeyPrice * 0.5;
        double winePrice = champagnePrice * 0.4;
        double waterPrice = champagnePrice * 0.1;

        double totalChampagnePrice = champagne * champagnePrice;
        double totalWinePrice = wine * winePrice;
        double totalWaterPrice = water * waterPrice;
        double totalWhiskeyPrice = whiskey * whiskeyPrice;

        double totalPrice = totalChampagnePrice + totalWinePrice + totalWaterPrice + totalWhiskeyPrice;
        System.out.printf("%.2f", totalPrice);
    }
}
