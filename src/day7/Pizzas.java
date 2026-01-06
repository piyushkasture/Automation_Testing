package day7;

import java.util.ArrayList;
import java.util.List;

public class Pizzas {
    private String name;
    private String size;
    private int quantity;
    private List<String> addons;

    public Pizzas(String name) {
        this.name = name;
        this.size = "M";   
        this.quantity = 1; 
        this.addons = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setSize(String size) {
        if (size.equalsIgnoreCase("S") || size.equalsIgnoreCase("M") ||
            size.equalsIgnoreCase("L") || size.equalsIgnoreCase("XL")) {
            this.size = size;
        } else {
            System.out.println("Invalid size, default size s ");
            this.size = "S";
        }
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void addAddon(String addon) {
        addons.add(addon);
    }

    private int getBasePrice() {
        switch (size.toUpperCase()) {
            case "S": return 200;
            case "M": return 300;
            case "L": return 400;
            case "XL": return 500;
            default: return 200;
        }
    }

    public int calculatePrice() {
        int basePrice = getBasePrice();
        int addonPrice = addons.size() * 50;
        int subtotal = (basePrice + addonPrice) * quantity;

        double gst = subtotal * 0.05;
        return (int) Math.round(subtotal + gst);
    }

    public void displayPizza() {
        int basePrice = getBasePrice();
        int addonPrice = addons.size() * 50;
        int subtotal = (basePrice + addonPrice) * quantity;
        double gst = subtotal * 0.05;
        int totalPrice = (int) Math.round(subtotal + gst);

        System.out.println("\n--- INVOICE ---");
        System.out.println("Pizza: " + name);
        System.out.println("Size: " + size);
        System.out.println("Quantity: " + quantity);
        if (!addons.isEmpty()) {
            System.out.println("Addons: " + addons);
        } else {
            System.out.println("Addons: None");
        }
        System.out.println("Subtotal: Rs." + subtotal);
        System.out.println("GST (5%): Rs." + Math.round(gst));
        System.out.println("Total Price: Rs." + totalPrice);
        System.out.println("---------------------");
    }
}