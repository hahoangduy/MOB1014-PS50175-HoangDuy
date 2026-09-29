/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.lab7;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class DichVuNhanVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeService service = new EmployeeServiceImpl();
        String timId;
        
        service.add(new FullTimeEmployee("FT01", "Nguyen Van An", 12000000));
        service.add(new PartTimeEmployee("PT01", "Tran Thi Binh", 80, 50000));
        service.add(new FullTimeEmployee("FT02", "Le Van Cuong", 15500000));
        service.add(new FullTimeEmployee("ft01", "Ngo Van Giang", 9000000));
        
        System.out.print("Nhap id: ");
        timId = sc.nextLine();
        if (service.findById(timId) != null) {
            System.out.println(service.findById(timId).getName());
        }
        
        System.out.println("=== DANH SACH NHAN VIEN ===");
        System.out.println(service.getAll());
        
        System.out.println("Tong luong: " + service.getTotalSalary());
    }
}
