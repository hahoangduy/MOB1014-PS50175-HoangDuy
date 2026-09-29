/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poly.lab7;

/**
 *
 * @author DELL
 */
public class CardPayment implements Payment{

    @Override
    public double pay(double amount) {
        return (amount * 0.95) + (amount * 0.95) * TAX;
    }
    
}
