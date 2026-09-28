/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.lab4;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class NhapXuatSinhVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student sv1 = new Student();
        Student sv2 = new Student();
        sv1.input(sc);
        sv2.input(sc);
        sv1.output();
        sv2.output();
    }
}
