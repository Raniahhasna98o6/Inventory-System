/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventory_system;

/**
 *
 * @author LENOVO
 */
public class Product {
    private int id;
    private String name;
    private double price;
    private int stock;
    
    public Product() {
    }
    
    public Product(int id, String name, double price, int stock) {
        this.id = id;
        this.name = name;
        setPrice(price);
        setStock(stock);
    }
    
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public int getStock() {
        return stock;
    }
    
    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Harga tidak boleh negatif!");
        }
    }
    public void setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
        } else {
            System.out.println("Stok barang tidak boleh negatif!");            
        }
    }
    
    public void addStock(int amount) {
        if (amount > 0) {
            stock += amount;
        } else {
            System.out.println("Jumlah stok tambahan tidak valid!");
        }
    }
    public void reduceStock(int amount) {
        if (amount > 0 && amount <= stock) {
            stock -= amount;
        } else {
            System.out.println("Stok tidak cukup!");
        }
    }
}
