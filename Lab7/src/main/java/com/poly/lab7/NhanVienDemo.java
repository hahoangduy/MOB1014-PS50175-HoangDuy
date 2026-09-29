/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.lab7;

/**
 *
 * @author DELL
 */
public class NhanVienDemo {
    public static void main(String[] args) {
        FullTimeEmployee ft = new FullTimeEmployee("FT01", "Nguyen Van An", 12000000);
        PartTimeEmployee pt = new PartTimeEmployee("PT01", "Tran Thi Binh", 80, 50000);
        
        System.out.printf(ft + "\nLuong: %.0f\n" , ft.getSalary());
        System.out.printf(pt + "\nLuong: %.0f" , pt.getSalary());
    }
}
