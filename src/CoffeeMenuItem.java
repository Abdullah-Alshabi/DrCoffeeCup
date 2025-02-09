public class CoffeeMenuItem {
    private String name;  // Name of the coffee.
    private double price; // Price of the coffee.

    // Constructor to initialize the coffee item with its name and price.
    public CoffeeMenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getter to get the name of the coffee.
    public String getName() {
        return name;
    }

    // Getter to get the price of the coffee.
    public double getPrice() {
        return price;
    }
}
