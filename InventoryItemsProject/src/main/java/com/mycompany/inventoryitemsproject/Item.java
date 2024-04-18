/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventoryitemsproject;

/**
 *
 * @author ray_g
 */
public class Item {
    private String name; // Item Name
    private int lot; // Number of items
    private double price; // Item price

    // Parameterless constructor
    public Item() {
    }

    // Constructor with parameters
    public Item(String name, int lot, double price) {
        this.name = name;
        this.lot = lot;
        this.price = price;

    }

    // Get and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLot() {
        return lot;
    }

    public void setLot(int lot) {
        try {
            //Convert and assign the lot as an integer
            this.lot = Integer.parseInt(String.valueOf(lot)); 
        } catch (NumberFormatException e) {
            //Catch the error if the lot is not a valid number
            System.err.println("Error: Lot must be a valid integer. Could not establish lot for the product: " + lot); 
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
