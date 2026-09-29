/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.lab7;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class EmployeeServiceImpl implements EmployeeService{
    private List<Employee> list = new ArrayList<>();

    @Override
    public boolean add(Employee e) {
        for (Employee employee : list) {
            if (employee.getId().toLowerCase().equals(e.getId().toLowerCase())) {
                System.out.println("Them that bai, trung id: " + e.getId());
                return false;
            }
        }
        list.add(e);
        System.out.println("Them thanh cong: " + e.getId());
        return true;
    }

    @Override
    public Employee findById(String id) {
        for (Employee employee : list) {
            if (employee.getId().toLowerCase().equals(id.toLowerCase())) {
                System.out.print("Tim thay: ");
                return employee;
            }
        }
        System.out.println("Khong tim thay nhan vien " + id);
        return null;
    }

    @Override
    public List<Employee> getAll() {
        return this.list;
    }

    @Override
    public double getTotalSalary() {
        double totalSalary = 0.0;
        for (Employee employee : list) {
            totalSalary += employee.getSalary();
        }
        return totalSalary;
    }
}
