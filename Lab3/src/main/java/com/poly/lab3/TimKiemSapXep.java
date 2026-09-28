/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.lab3;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class TimKiemSapXep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, x;
        boolean timThay = false;
        
        do {            
            System.out.print("Nhap so phan tu: ");
            n = sc.nextInt();
        } while (n <= 0);
        
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhap vao phan tu thu %d: ", i);
            a[i] = sc.nextInt();
        }
        System.out.print("Nhap x: ");
        x = sc.nextInt();
        System.out.printf("Vi tri cua %d trong mang: ", x);
        for (int i = 0; i < a.length; i++) {
            if (x == a[i]) {
                System.out.print(i + " ");
                timThay = true;
            }
        }
        System.out.println();
        if (!timThay) {
            System.out.println("Khong tim thay");
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] < a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        System.out.println("Mang giam dan (Bubble Sort): " + Arrays.toString(a));
        int[] b = Arrays.copyOf(a, a.length);       
        Arrays.sort(b);
        System.out.print("Mang tang dan (Arrays.sort): " + Arrays.toString(b));
    }
}
