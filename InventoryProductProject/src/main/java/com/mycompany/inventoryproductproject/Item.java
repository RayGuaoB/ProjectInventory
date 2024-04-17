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
    private int lot; // lot del producto
    private double price; // Precio del producto
    

    // Constructor sin parámetros
    public Item() {
    }

    // Constructor con parámetros
    public Item(String name, int lot, double price) {
        this.name = name; // Asigna el nombre del producto
        this.lot = lot; // Asigna el stock del producto
        this.price = price; // Asigna el precio del producto
        
    }

    // Método para obtener el nombre del producto
    public String getName() {
        return name; // Devuelve el nombre del producto
    }

    // Método para establecer el nombre del producto
    public void setName(String name) {
        this.name = name; // Asigna un nuevo nombre al producto
    }

    // Método para obtener el stock del producto
    public int getLot() {
        return lot; // Devuelve el stock del producto
    }

    // Método para establecer el stock del producto
    public void setLot(int lot) {
        try {
            this.lot = Integer.parseInt(String.valueOf(lot)); // Convierte y asigna el stock como un entero
        } catch (NumberFormatException e) {
            System.err.println("Error: Stock must be a valid integer. Could not establish stock for the product: " + lot); // Captura el error si el stock no es un número válido
        }
    }
    
    // Método para obtener el precio del producto
    public double getPrice() {
        return price; // Devuelve el precio del producto
    }

    // Método para establecer el precio del producto
    public void setPrice(double price) {
        this.price = price; // Asigna un nuevo precio al producto
    }
}
