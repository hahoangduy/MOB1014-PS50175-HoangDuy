/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.lab3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class TrungBinhChia3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, tong = 0, dem = 0;
        double trungBinh;
        System.out.print("Nhap vao so n: ");
        n = sc.nextInt();
        if (n <= 0)
            System.out.println("N phai la so nguyen duong!");
        else {
            for (int i = 1; i <= n; i++) {
                if (i % 3 == 0) {
                    dem++;
                    tong += i;
                }
            }
            if (dem == 0)
                System.out.println("Khong co so nao chia het cho 3");
            else {
                trungBinh = (double) tong / dem;
                System.out.print("Cac so chia het cho 3: ");
                for (int i = 1; i <= n; i++) {
                    if (i % 3 == 0)
                        System.out.print(i + " ");
                }
                System.out.println();
                System.out.println("Tong: " + tong);
                System.out.printf("Trung binh cong: %.2f", trungBinh);
            }
        }
    }
}
