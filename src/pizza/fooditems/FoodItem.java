package pizza.fooditems;

/**
 * Represents a food item.
 */
public class FoodItem {
    private String name; // Name of the food item
    private String unitsOfMeasure; // Units of measurement for the quantity of the food item
    private float quantity; // Quantity of the food item
    private double pricePerUnit; // Price per unit of the food item

    /**
     * Constructor to initialize a FoodItem object with a name.
     * @param name The name of the food item.
     */
    public FoodItem(String name) {
        this.name = name;
    }

    /**
     * Set the units of measurement for the quantity of the food item.
     * @param unitType The units of measurement.
     */
    public void setUnitsOfMeasure(String unitType) {
        this.unitsOfMeasure = unitType;
    }

    /**
     * Set the quantity of the food item.
     * @param quantity The quantity of the food item.
     */
    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    /**
     * Set the price per unit of the food item.
     * @param price The price per unit of the food item.
     */
    public void setPricePerUnit(double price) {
        this.pricePerUnit = price;
    }

    /**
     * Get the name of the food item.
     * @return The name of the food item.
     */
    public String getName() {
        return name;
    }

    /**
     * Calculate the total price of the food item.
     * @return The total price of the food item.
     */
    public double price() {
        return quantity * pricePerUnit;
    }
}
