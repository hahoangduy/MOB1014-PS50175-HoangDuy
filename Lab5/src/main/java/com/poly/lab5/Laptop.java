/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.poly.lab5;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Laptop {
    private String id;
    private String name;
    private String type;
    private double price;
    private int quantity;

    public Laptop() {
    }

    public Laptop(String id, String name, String type, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.price = price;
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(double price) {
        if (price < 0) 
            System.out.println("Gia khong hop le");
        else 
            this.price = price;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) 
            System.out.println("So luong khong hop le");
        else 
            this.quantity = quantity;
    }
    
    public void input(Scanner sc) {
        System.out.print("Nhap id: ");
        this.id = sc.nextLine();
        
        System.out.print("Nhap ten: ");
        this.name = sc.nextLine();
        
        System.out.print("Nhap loai: ");
        this.type = sc.nextLine();
        
        System.out.print("Nhap gia: ");
        this.price = sc.nextDouble();
        
        System.out.print("Nhap so luong: ");
        this.quantity = sc.nextInt();
        sc.nextLine();
    }
    
    public void output() {
        System.out.println("ID: " + this.id + " | Ten: " + this.name + " | Loai: " + this.type + " | Gia: " + this.price + " | So luong: " + this.quantity);
    }
}
