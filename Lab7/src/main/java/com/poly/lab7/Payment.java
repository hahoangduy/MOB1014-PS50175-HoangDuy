/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.lab7;

/**
 *
 * @author DELL
 */
public interface Payment {
    public static final double TAX = 0.1;

    public abstract double pay(double amount);
}
