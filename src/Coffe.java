import java.util.HashMap;
import java.util.Map;

class Coffee {
    private static int count = 0;  // Keeps track of the number of coffee cups created.

    private enum CupSize {
        SMALL, MEDIUM, LARGE, EXTRA_LARGE  // Enum for coffee cup sizes.
    }

    private static final Map<String, Integer> coffeePrices = new HashMap<>();

    static {
        // Initialize coffee prices for different types.
        coffeePrices.put("Coffee", 8);
        coffeePrices.put("Espresso", 14);
        coffeePrices.put("Cappuccino", 12);
        coffeePrices.put("Flat white", 13);
        coffeePrices.put("Macchiato", 15);
        coffeePrices.put("Latte", 15);
        coffeePrices.put("Irish coffee", 16);
        coffeePrices.put("Turkish coffee", 17);
    }

    private CupSize size;  // Coffee size.

    public void setSize(String size) {
        // Set the size of the coffee.
        this.size = CupSize.valueOf(size.toUpperCase());
    }

    public double getPrice() {
        // Get the price of the coffee based on its size.
        double basePrice = coffeePrices.get("Coffee");
        if (size == CupSize.MEDIUM) {
            basePrice *= 1.20;
        } else if (size == CupSize.LARGE) {
            basePrice *= 1.35;
        } else if (size == CupSize.EXTRA_LARGE) {
            basePrice *= 1.50;
        }
        return basePrice;
    }

    public static int getCount() {
        // Return the total number of coffee cups created.
        return count;
    }

    public Coffee() {
        // Increment the counter whenever a new coffee cup is created.
        count++;
    }
}
