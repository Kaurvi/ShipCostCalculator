import java.util.Scanner;

public class ShipCostCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the price of the item: ");
        double price = in.nextDouble();
        double shippingCost;
        double totalCost;
        if (price >= 100) {
            shippingCost = 0;
            System.out.println("Your Shipping is free!");
            System.out.println("The Total cost is $" +price);
        } else {
            shippingCost = price * 0.02;
            totalCost = price + shippingCost;
            System.out.println("The shipping cost is $" + shippingCost);
            System.out.println("The total cost is $" +totalCost);
            System.exit(0);
        }
    }
}