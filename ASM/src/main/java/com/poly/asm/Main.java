/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.asm;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        ArrayList<SanPham> list = new ArrayList<>();
        
        do {
            System.out.println("=== MENU CHUONG TRINH ===");
            System.out.println("1. Nhap thong tin san pham");
            System.out.println("2. Hien thi thong tin san pham");
            System.out.println("3. Tinh tien san pham");
            System.out.println("4. Cap nhat thong tin san pham");
            System.out.println("5. Thoat chuong trinh");
            System.out.print("Moi chon: ");
            choice = sc.nextInt();
            sc.nextLine();
            
            switch (choice) {
                case 1:
                    list.add(new SanPham("SP001", "Dien Thoai", 1000000, 2));
                    list.add(new SanPhamDienTu("SP002", "LapTop", 1600000, 9, "20/1"));
                    list.add(new SanPhamDienTu("SP003", "PC", 2900000, 5, "29/5"));
                    list.add(new SanPhamTieuDung("SP004", "Gao", 800000, 10, 0.2));
                    list.add(new SanPhamTieuDung("SP005", "Quan Ao", 900000, 29, 0.8));
                    break;
                case 2:
                    for (SanPham sanPham : list) {
                        sanPham.xuat();
                    }
                    break;
                case 3:
                    for (SanPham sanPham : list) {
                        System.out.printf("Tong tien cua san pham %s la: %.0f VND\n",sanPham.maSP, sanPham.thanhTien());
                    }
                    break;
                case 4:
                    System.out.print("Nhap id can cap nhat: ");
                    String idUpdate = sc.nextLine();
                    for (SanPham sanPham : list) {
                        if (sanPham.maSP.equalsIgnoreCase(idUpdate)) {
                            sanPham.capNhat(idUpdate);
                            break;
                        }
                    }
                    System.out.printf("Khong tim thay san pham co ma %s\ns", idUpdate);
                    break;
                case 5:
                    System.out.println("Da thoat");
                    break;
                default:
                    System.out.println("Khong co chuc nang nay, moi chon lai");
                    break;
            }
        }while (choice != 5);
    }
}
