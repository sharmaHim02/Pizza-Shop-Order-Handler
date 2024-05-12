package pizza.fooditems;


import java.util.ArrayList;

import pizza.services.Deliverable;

// A class representing a Pizza which implements the Deliverable interface
public class Pizza implements Deliverable {
    // Constant to represent thin crust type
    public static final boolean THIN_CRUST = true;

    // Instance variables
    private int sizeInInches;       // Size of the pizza in inches
    private String typeOfSauce;     // Type of sauce used in the pizza
    private boolean thinCrust;      // Indicates whether the crust is thin or not
    private ArrayList<FoodItem> toppings;    // LinkedList to store toppings of the pizza
    private double basePrice;       // Base price of the pizza
    private int toppingCount;


    // Constructor to initialize a Pizza object with size and sauce type
    public Pizza(int size, String sauce) {
        this.sizeInInches = size;
        this.typeOfSauce = sauce;
    }

    // Constructor to initialize a Pizza object with size and base price
    public Pizza(int size, double basePrice) {
        this.sizeInInches = size;
        this.basePrice = basePrice;
    }

    // Getter method for sauce type
    public String getTypeOfSauce() {
        return typeOfSauce;
    }

    // Getter method for toppings
    public ArrayList<FoodItem> getToppings() {
        return toppings;
    }

    // Getter method for base price
    public double getBasePrice() {
        return basePrice;
    }

    // Setter method for thin crust
    public void setThinCrust(boolean thinCrust) {
        this.thinCrust = thinCrust;
    }

    // Setter method for base price
    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    // Method to add a topping to the pizza
    public void addTopping(FoodItem item) {
		// Uses the linkedlist add method to add the item		
		toppings.add(item);
		//	Increases topping count by 1
		toppingCount++;
    }

    // Method to get the size of the pizza in inches
    public int sizeInInches() {
        return sizeInInches;
    }

    // Method to calculate delivery cost based on pizza size
    public double deliveryCost() {
        double deliveryCost = 0.0;
        if (sizeInInches == 10) {
            deliveryCost = 2.50;
        } else if (sizeInInches == 12) {
            deliveryCost = 3.50;
        } else if (sizeInInches == 14) {
            deliveryCost = 4.75;
        } else {
            System.out.println("Delivery cost not available for size: " + sizeInInches + " inches.");
        }
        return deliveryCost;
    }

    // Method to get the base price of the pizza
    public double bPrice() {
        return getBasePrice();
    }

    // Method to calculate total price of the pizza including toppings and delivery cost
    public double totalPrice() {
        double totalPrice = bPrice() + deliveryCost();
        for (FoodItem topping : toppings) {
            totalPrice += topping.price();
        }
        return totalPrice;
    }

    // Overridden toString() method to represent Pizza object as a string
    @Override
    public String toString() {
        return "Pizza [sizeInInches=" + sizeInInches + ", typeOfSauce=" + typeOfSauce + ", thinCrust=" + thinCrust
                + ", toppings=" + toppings + ", basePrice=" + basePrice + "]";
    }
}
