/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventoryproductproject;

/**
 *
 * @author ray_g
 */
public class Item {
    private String name; // Nombre del producto
    private int lot; // cantidad de productos
    private double price; // Precio del producto
    

    // Constructor sin parámetros
    public Item() {
    }

    // Constructor con parámetros
    public Item(String name, int lot, double price) {
        this.name = name; 
        this.lot = lot; 
        this.price = price; 
        
    }

    // Get y setters
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
            this.lot = Integer.parseInt(String.valueOf(lot)); // Convierte y asigna el lot como un entero
        } catch (NumberFormatException e) {
            System.err.println("Error: Lot must be a valid integer. Could not establish lot for the product: " + lot); // Captura el error si el lot no es un número válido
        }
    }
  
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price; 
    }
}
