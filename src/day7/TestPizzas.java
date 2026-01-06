package day7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestPizzas {
    public static void main(String[] args) {
        Pizzas p1 = new Pizzas("Margherita ");
        Pizzas p2 = new Pizzas("Farmhouse");
        Pizzas p3 = new Pizzas("Veg Supreme");
        Pizzas p4 = new Pizzas("Pepperoni");

        List<Pizzas> pizzaList = new ArrayList<>();
        pizzaList.add(p1);
        pizzaList.add(p2);
        pizzaList.add(p3);
        pizzaList.add(p4);

        Scanner sc = new Scanner(System.in);

        boolean running = true;
        while (running) {
            System.out.println("\nPizza Menu:");
            int index = 1;
            for (Pizzas pizza : pizzaList) {
                System.out.println(index + ". " + pizza.getName());
                index++;
            }

            System.out.println("0. Exit");
            System.out.print("\nEnter your choice: ");
            int choice = sc.nextInt();

            if (choice == 0) {
                running = false;
                System.out.println("Thank you!");
            } else if (choice > 0 && choice <= pizzaList.size()) {
                Pizzas selectedPizza = pizzaList.get(choice - 1);

                System.out.print("Enter size (S-200 M-300 L-400 XL-500): ");
                String size = sc.next();
                selectedPizza.setSize(size);

                System.out.print("Enter quantity: ");
                int qty = sc.nextInt();
                selectedPizza.setQuantity(qty);

                System.out.print("Do you want addons? (y/n): ");
                String addonChoice = sc.next();
                if (addonChoice.equalsIgnoreCase("y")) {
                    boolean addingAddons = true;
                    while (addingAddons) {
                        System.out.println("Addons: ");
                        System.out.println("1. Extra Cheese (Rs.50)");
                        System.out.println("2. toppings (Rs.50)");
                        System.out.println("3. cold drinks (Rs.50)");
                        System.out.println("0. Done");

                        System.out.print("Choose addon: ");
                        int addon = sc.nextInt();

                        switch (addon) {
                            case 1 -> selectedPizza.addAddon("Extra Cheese");
                            case 2 -> selectedPizza.addAddon("toppings");
                            case 3 -> selectedPizza.addAddon("cold drinks");
                            case 0 -> addingAddons = false;
                            default -> System.out.println("Invalid addon choice.");
                        }
                    }
                }

                selectedPizza.displayPizza();

            } else {
                System.out.println("Try again.");
            }
        }

        sc.close();
    }
}