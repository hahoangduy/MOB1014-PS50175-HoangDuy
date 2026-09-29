/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.lab7;

import java.util.List;

/**
 *
 * @author DELL
 */
public interface EmployeeService {
    public abstract boolean add(Employee e);
    public abstract Employee findById(String id);
    public abstract List<Employee> getAll();
    public abstract double getTotalSalary();
}
