class GroceryItemOrder {
    private String name;
    private double pricePerUnit;
    private int quantity;

    public GroceryItemOrder(String name, double pricePerUnit) {
        this.name = name;
        this.pricePerUnit = pricePerUnit;
        this.quantity = 1;
    }

    public double getCost() {
        return pricePerUnit * quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            throw new IllegalArgumentException("Quantity must be greater than zero.");
        }
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }
}

class GroceryList {
    private ArrayList<GroceryItemOrder> items;
    private static final int MAX_ITEMS = 10;

    public GroceryList() {
        items = new ArrayList<>();
    }

    public void add(GroceryItemOrder item) {
        if (items.size() < MAX_ITEMS) {
            items.add(item);
        } else {
            System.out.println("Grocery list is full. Cannot add more items.");
        }
    }

    public double getTotalCost() {
        double totalCost = 0.0;
        for (GroceryItemOrder item : items) {
            totalCost += item.getCost();
        }
        return totalCost;
    }

    public int getSize() {
        return items.size();
    }

    public void displayItems() {
        for (GroceryItemOrder item : items) {
            System.out.println(item.getQuantity() + " x " + item.getName() + " @ $" + item.getPricePerUnit() + " each");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        GroceryList groceryList = new GroceryList();

        GroceryItemOrder cookies = new GroceryItemOrder("Cookies", 2.30);
        cookies.setQuantity(4);
        groceryList.add(cookies);

        GroceryItemOrder milk = new GroceryItemOrder("Milk", 1.50);
        milk.setQuantity(2);
        groceryList.add(milk);

        GroceryItemOrder bread = new GroceryItemOrder("Bread", 2.00);
        groceryList.add(bread);

        System.out.println("Grocery List Items:");
        groceryList.displayItems();
        System.out.printf("Total Cost: $%.2f%n", groceryList.getTotalCost());
    }
}
