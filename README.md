# DrCoffeeCup Project ☕️

DrCoffeeCup is a coffee shop management system that allows customers to select different coffee types, choose cup sizes, add additives, and calculate the total price of their coffee. The system also includes a feature to track the number of coffee cups sold.

## Features ✨

- **Coffee Menu**: Multiple coffee types like Espresso, Cappuccino, Latte, and more. ☕️
- **Cup Sizes**: Choose from four different cup sizes: Small, Medium, Large, Extra Large. 🍵
- **Additives**: Add Milk, Cream, Chocolate, or Cinnamon to your coffee. 🥛🍫
- **Discounts**: Discounts applied based on the number of cups purchased. 💸
- **Pickup Time**: Parse and convert the pickup time from AM/PM format to 24-hour format. ⏰
- **Interactive CLI**: The system interacts with customers through the command line interface to gather their preferences. 🖥️

## Installation & Usage ⚙️

### Clone the Repository

Clone the project repository to your local machine:

```bash
git clone https://github.com/yourusername/DrCoffeeCup.git
```

### Compile & Run the Program 🏃‍♂️

1. Navigate to the project directory:

   ```bash
   cd DrCoffeeCup
   ```

2. Compile the Java files:

   ```bash
   javac *.java
   ```

3. Run the program:

   ```bash
   java Main
   ```

### Usage Instructions 📝

1. **Select Coffee Type**: Choose your preferred coffee from the list of available options.
2. **Choose Cup Size**: Select your cup size (Small, Medium, Large, Extra Large).
3. **Add Additives**: Optionally, choose from Milk, Cream, Chocolate, or Cinnamon to customize your drink.
4. **Confirm & Pay**: View the total price of your coffee and confirm the order.

## Technologies Used 💻

- **Java**: Core programming language for logic implementation. ☕️
- **Git**: Version control for source code tracking and collaboration. 🔧

## Project Structure 🗂️

```
DrCoffeeCup/
│
├── Main.java               # Entry point for the application. Starts the coffee shop process.
├── Coffee.java             # Defines the Coffee class with coffee details and price calculations.
├── DrCoffeeCup.java        # Manages coffee sales, menu, price calculations, and customer interactions.
├── InstanceCounter.java    # Tracks the number of coffee cups created and prints the total count.
├── PickupTimeParser.java   # Handles AM/PM to 24-hour format conversion for pickup time.
├── DiscountCalculator.java # Calculates discounts based on the number of cups purchased.
└── CoffeeMenuItem.java     # Defines the coffee menu item with a name and price.
```

### **InstanceCounter.java**:
- **Purpose**: This file is responsible for creating instances of the `Coffee` class and counting how many cups have been created by utilizing the static counter in the `Coffee` class.
- **How it works**: When you run `InstanceCounter.java`, it will create two instances of `Coffee` and print the total number of cups created by calling `Coffee.getCount()`.

## Future Enhancements 🚀

- **User-Friendly Interface**: Improve the command-line user interface for a better user experience. 🎨
- **Database Support**: Store customer orders and sales data in a database. 🗄️
- **Graphical Reports**: Provide graphical analysis of sales and trends. 📊

## Contributing 🤝

Contributions, bug reports, and feature requests are welcome!

- Fork the repository.
- Create a new branch for your feature or fix.
- Make changes and commit your improvements.
- Open a pull request.

## License 📜

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Show Your Support! 🌟

If you find this project useful, give it a ⭐ on [GitHub](https://github.com/yourusername/DrCoffeeCup)!

Your support is appreciated! 😊