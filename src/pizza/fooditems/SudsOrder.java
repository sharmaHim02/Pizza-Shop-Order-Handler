package pizza.fooditems;

import pizza.services.Deliverable;

/**
 * Represents an order for a non-pizza item (suds order), which implements the Deliverable interface.
 */
public class SudsOrder implements Deliverable {
    private String name; // Name of the suds item
    private int number; // Number of suds items ordered
    private int sizeInML; // Size of each suds item in milliliters

    /**
     * Constructor to initialize a SudsOrder object.
     * @param name The name of the suds item.
     * @param number The number of suds items ordered.
     * @param size The size of each suds item in milliliters.
     */
    public SudsOrder(String name, int number, int size) {
        this.name = name;
        this.number = number;
        this.sizeInML = size;
    }

    /**
     * Get the name of the suds item.
     * @return The name of the suds item.
     */
    public String getName() {
        return name;
    }

    /**
     * Get the number of suds items ordered.
     * @return The number of suds items ordered.
     */
    public int getNumber() {
        return number;
    }

    /**
     * Get the size of each suds item in milliliters.
     * @return The size of each suds item in milliliters.
     */
    public int getSizeinML() {
        return sizeInML;
    }

    /**
     * Calculate the delivery cost for the suds order.
     * @return The delivery cost for the suds order.
     */
    public double deliveryCost() {
        // Assuming a fixed delivery cost of $0.75 per suds item
        return number * 0.75;
    }
}
