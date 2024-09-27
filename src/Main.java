import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double itemCost = 0;
        double shippingCost = 0;
        double totalCost = 0;
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter the price of the item: ");

        if (in.hasNextDouble()) {
            itemCost = in.nextDouble();
            in.nextLine();
        }

        if (itemCost >= 100) {
            System.out.println("The shipping for this order is free, " +
                    "so the total cost is " + itemCost);
        } else {
            shippingCost = itemCost * 0.02;
            totalCost = itemCost + shippingCost;
            System.out.println("The item was " + itemCost + ", the shipping is " +
                    "2% of the item's cost, which is " + shippingCost +
                    ", so the total comes out to " + totalCost);
        }

    }
}