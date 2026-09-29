/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.lab5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class SapXepLaptop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Laptop> list = new ArrayList<>();
        
        list.add(new Laptop("LT01", "Dell Inspiron 15", "Van phong", 15500000, 10));
        list.add(new Laptop("LT02", "Asus TUF Gaming F15", "Gaming", 22990000, 5));
        list.add(new Laptop("LT03", "MacBook Air M2", "Van phong", 24990000, 8));
        list.add(new Laptop("LT04", "Lenovo Legion 5", "Gaming", 32500000, 0));
        list.add(new Laptop("LT05", "HP Pavilion 14", "Van phong", 17800000, 0));
        
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size() - i - 1; j++) {
                if (list.get(j).getName().compareToIgnoreCase(list.get(j+1).getName()) > 0) {
                    Laptop temp = list.get(j);
                    list.set(j, list.get(j+1));
                    list.set(j+1, temp);
                }
            }
        }
        
        System.out.println("=== SAP XEP THEO TEN (A-Z) ===");
        for (Laptop laptop : list) {
            laptop.output();
        }
        
        list.sort(Comparator.comparing(Laptop::getPrice).reversed());
        System.out.println("=== SAP XEP THEO GIA GIAM DAN ===");
        for (Laptop laptop : list) {
            laptop.output();
        }
    }
}
