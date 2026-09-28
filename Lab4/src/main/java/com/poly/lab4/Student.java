/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.poly.lab4;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Student {
    public String id;
    public String name;
    public int age;
    public double gpa;

    public Student() {
    }
    
    public Student(String id, String name, int age, double gpa) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }
    
    
    
    public void input(Scanner sc) {
        
        System.out.print("Nhap MSSV: ");
        this.id = sc.nextLine();
        
        System.out.print("Nhap ho ten: ");
        this.name = sc.nextLine();
        
        System.out.print("Nhap tuoi: ");
        this.age = sc.nextInt();
        
        System.out.print("Nhap diem trung binh: ");
        this.gpa = sc.nextDouble();
        sc.nextLine();
    }
    
    
    public void output() {
        System.out.println("ID: " + this.id + " | Ho ten: " + this.name + " | Tuoi: " + this.age + " | GPA: " + this.gpa + " | Xep loai: " + rank());
    }
    
    
    public String rank() {
        if (this.gpa >= 9.0)
            return "Excellent";
        else if (this.gpa >= 8.0)
            return "Very Good";
        else if (this.gpa >= 6.5)
            return "Good";
        else if (this.gpa >= 5.0)
            return "Average";
        else 
            return "Fail";
    }
}
