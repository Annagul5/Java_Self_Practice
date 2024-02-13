package javaDay07;

public class ItemClient {
    public static void main(String[] args) {
        Item item = new Item();

        item.itemName="Bag";
        item.unitPrice=30;
        item.quantity=2;

        System.out.println("Item name: " +item.itemName);
        System.out.println("Item unit price: " +item.unitPrice);
        System.out.println("Item quantity: " +item.quantity);

        item.calcCost();

        System.out.println(item);
    }
}
