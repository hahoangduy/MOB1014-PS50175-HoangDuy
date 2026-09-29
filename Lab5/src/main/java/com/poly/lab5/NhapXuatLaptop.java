/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.lab5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class NhapXuatLaptop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Laptop> list = new ArrayList<>();
        String choice;
        do {
            Laptop lt = new Laptop();
            lt.input(sc);
            list.add(lt);
            System.out.print("Tiep tuc nhap? (y/n): ");
            choice = sc.nextLine();
        }while(choice.equals("y") || choice.equals("Y"));
        
        System.out.printf("=== DANH SACH LAPTOP (%d may) ===\n", list.size());
        for (Laptop laptop : list) {
            laptop.output();
        }
    }
}
