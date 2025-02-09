public class CoffeeMenuItem {
    private String name;  // اسم القهوة
    private double price; // سعر القهوة

    // Constructor لتعيين القيم عند إنشاء الكائن
    public CoffeeMenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getter للحصول على اسم القهوة
    public String getName() {
        return name;
    }

    // Getter للحصول على سعر القهوة
    public double getPrice() {
        return price;
    }
}
