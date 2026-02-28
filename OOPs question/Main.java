package oopsAssessment;

import java.util.ArrayList;
import java.util.List;

//Abstract Class
abstract class FoodItem {
    private int id;
    private String name;
    private double price;
//Parameterized Constructor
    public FoodItem(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    // Abstract method
    public abstract double calculateDiscount();
}

//Subclass 1
class VegItem extends FoodItem
  {
    public VegItem(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.10; 
    }
}
//Subclass 2
class NonVegItem extends FoodItem {
    public NonVegItem(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.05; 
    }
}


class Order {
    
    private List<FoodItem> items = new ArrayList<>();

    public void addItem(FoodItem item) {
        items.add(item);
    }

    public double calculateTotalBill() {
        double total = 0;
        for (FoodItem item : items) {
      
            double finalPrice = item.getPrice() - item.calculateDiscount();
            total += finalPrice;
            
            System.out.println(item.getName() + " | Original Price: " + item.getPrice() + 
                               " | Discount: " + item.calculateDiscount() + 
                               " | Final: " + finalPrice);
        }
        return total;
    }
}

public class Main {
    public static void main(String[] args) {
        Order myOrder = new Order();

        
        myOrder.addItem(new VegItem(1, "Paneer Tikka", 200.0));
        myOrder.addItem(new NonVegItem(2, "Chicken Biryani", 300.0));
        myOrder.addItem(new VegItem(3, "Naan", 50.0));

        System.out.println(" Order Bill Details ");
        double totalBill = myOrder.calculateTotalBill();
        System.out.println("Total Amount to Pay: Rs. " + totalBill);
    }
}