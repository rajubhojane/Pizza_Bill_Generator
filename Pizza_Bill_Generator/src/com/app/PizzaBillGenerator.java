package com.app;

import java.util.ArrayList;
import java.util.Scanner;

// Pizza Class
class Pizza {
    private String type;
    private String size;
    private double basePrice;

    public Pizza(String type, String size, double basePrice) {
        this.type = type;
        this.size = size;
        this.basePrice = basePrice;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public String getType() {
        return type;
    }

    public String getSize() {
        return size;
    }

    @Override
    public String toString() {
        return type + " Pizza (" + size + ") - ₹" + basePrice;
    }
}

// Topping Class
class Topping {
    private String name;
    private double price;

    public Topping(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " - ₹" + price;
    }
}

// Order Class
class Order {
    private ArrayList<Pizza> pizzas;
    private ArrayList<Topping> toppings;

    public Order() {
        pizzas = new ArrayList<>();
        toppings = new ArrayList<>();
    }

    public void addPizza(Pizza pizza) {
        pizzas.add(pizza);
    }

    public void addTopping(Topping topping) {
        toppings.add(topping);
    }

    public double calculateTotal() {
        double total = 0;
        for (Pizza pizza : pizzas) {
            total += pizza.getBasePrice();
        }
        for (Topping topping : toppings) {
            total += topping.getPrice();
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder bill = new StringBuilder();
        bill.append("----- Pizza Bill -----\n");
        for (Pizza pizza : pizzas) {
            bill.append(pizza).append("\n");
        }
        for (Topping topping : toppings) {
            bill.append(topping).append("\n");
        }
        bill.append("----------------------\n");
        bill.append("Total: ₹").append(calculateTotal()).append("\n");
        return bill.toString();
    }
}

// Main Class
public class PizzaBillGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Order order = new Order();

        System.out.println("Welcome to the Pizza Bill Generator!");

        // Add Pizzas
        System.out.println("Enter the number of pizzas:");
        int numPizzas = scanner.nextInt();
        for (int i = 0; i < numPizzas; i++) {
            System.out.println("Enter pizza type (Veg/Non-Veg):");
            String type = scanner.next();
            System.out.println("Enter pizza size (Small/Medium/Large):");
            String size = scanner.next();
            System.out.println("Enter pizza price:");
            double price = scanner.nextDouble();
            order.addPizza(new Pizza(type, size, price));
        }

        // Add Toppings
        System.out.println("Enter the number of toppings:");
        int numToppings = scanner.nextInt();
        for (int i = 0; i < numToppings; i++) {
            System.out.println("Enter topping name:");
            String name = scanner.next();
            System.out.println("Enter topping price:");
            double price = scanner.nextDouble();
            order.addTopping(new Topping(name, price));
        }

        // Display Bill
        System.out.println(order);

        scanner.close();
    }
}

