/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.lab3;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class NhapSoHopLe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int so, dem = 0;
        do { 
            System.out.print("Nhap so: ");
            so = sc.nextInt();
            if (!(so > 0 && so % 3 == 0 && so % 5 == 0)) {
                System.out.println("So khong hop le, moi nhap lai!");
                dem++;
            }
            else {
                dem++;
                System.out.printf("So hop le: %d (sau %d lan nhap)", so, dem);
            }
        } while (!(so > 0 && so % 3 == 0 && so % 5 == 0));
    }
}
