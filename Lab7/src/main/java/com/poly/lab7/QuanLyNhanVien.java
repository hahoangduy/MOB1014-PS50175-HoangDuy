/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.lab7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author DELL
 */
public class QuanLyNhanVien {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        
        list.add(new FullTimeEmployee("FT01", "Nguyen Van An", 12000000));
        list.add(new PartTimeEmployee("PT01", "Tran Thi Binh", 80, 50000));
        list.add(new FullTimeEmployee("FT02", "Le Van Cuong", 15500000));
        list.add(new PartTimeEmployee("PT02", "Pham Thi Dung", 120, 60000));
        list.add(new PartTimeEmployee("PT03", "Hoang Van Em", 200, 90000));
        
        System.out.println("=== DANH SACH NHAN VIEN ===");
        for (Employee employee : list) {
            System.out.printf(employee + " -> Luong: %.0f\n" , employee.getSalary());
        }
        System.out.println();
        
        double tongQuyLuong = 0.0;
        for (Employee employee : list) {
            tongQuyLuong += employee.getSalary();
        }
        System.out.printf("Tong quy luong: %.0f\n", tongQuyLuong);
        System.out.println();
        
        Employee luongCaoNhat = list.get(0);
        for (Employee employee : list) {
            if (employee.getSalary() > luongCaoNhat.getSalary())
                luongCaoNhat = employee;
        }
        System.out.printf("Nhan vien luong cao nhat: \n" + luongCaoNhat + " -> Luong: %.0f", luongCaoNhat.getSalary());
        System.out.println();
        
        System.out.println("=== SAP XEP THEO LUONG GIAM DAN ===");
        list.sort(Comparator.comparing(Employee::getSalary).reversed());
        for (Employee employee : list) {
            System.out.println(employee);
        }
    }
}
