public class InstanceCounter {
    public static void main(String[] args) {
        // Create two coffee cups.
        @SuppressWarnings("unused")
        Coffee largeCup = new Coffee();
        @SuppressWarnings("unused")
        Coffee largeCup2 = new Coffee();

        // Print the total number of coffee cups created.
        System.out.println("Total number of cups: " + Coffee.getCount());
    }
}
