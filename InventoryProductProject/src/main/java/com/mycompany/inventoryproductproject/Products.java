/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventoryproductproject;

/**
 *
 * @author ray_g
 */
public class Products {
    private String name; // Nombre del producto
    private double price; // Precio del producto
    private int stock; // Stock del producto

    // Constructor sin parámetros
    public Products() {
    }

    // Constructor con parámetros
    public Products(String name, double price, int stock) {
        this.name = name; // Asigna el nombre del producto
        this.price = price; // Asigna el precio del producto
        this.stock = stock; // Asigna el stock del producto
    }

    // Método para obtener el nombre del producto
    public String getName() {
        return name; // Devuelve el nombre del producto
    }

    // Método para establecer el nombre del producto
    public void setName(String productName) {
        this.name = name; // Asigna un nuevo nombre al producto
    }

    // Método para obtener el precio del producto
    public double getPrice() {
        return price; // Devuelve el precio del producto
    }

    // Método para establecer el precio del producto
    public void setPrice(double price) {
        this.price = price; // Asigna un nuevo precio al producto
    }

    // Método para obtener el stock del producto
    public int getStock() {
        return stock; // Devuelve el stock del producto
    }

    // Método para establecer el stock del producto
    public void setStock(int stock) {
        try {
            this.stock = Integer.parseInt(String.valueOf(stock)); // Convierte y asigna el stock como un entero
        } catch (NumberFormatException e) {
            System.err.println("Error: Stock must be a valid integer. Could not establish stock for the product: " + stock); // Captura el error si el stock no es un número válido
        }
    }
}
