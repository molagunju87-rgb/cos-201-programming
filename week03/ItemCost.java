import java.util.Scanner;

public class ItemCost {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter item name: ");
        String name = input.nextLine();
        System.out.print("Enter quantity: ");
        int qty = input.nextInt();
        System.out.print("Enter price per item: ");
        double price = input.nextDouble();

        double total = qty * price;
        System.out.println("Item: " + name);
        System.out.println("Total cost: " + total);

        input.close();
    }
}