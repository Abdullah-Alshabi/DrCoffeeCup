public class DiscountCalculator {
    public static double getDiscount(int numberOfCups) {
        int discount = 0;
        while (numberOfCups >= 3) {
            discount += 5;  // Apply 5 SR discount for every 3 cups.
            numberOfCups -= 3;
        }
        return discount;
    }
}
