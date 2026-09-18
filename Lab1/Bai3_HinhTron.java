package Lab1;

import java.util.Scanner;

public class Bai3_HinhTron {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double PI = 3.14159;
        double r, cv, dt;
        System.out.print("Ban kinh hinh tron: ");
        r = sc.nextDouble();
        cv = 2 * PI * r;
        dt = PI * (r*r);
        System.out.printf("Duong tron co ban kinh %.2f \nChu vi: %.2f\nDien tich: %.2f \n", r, cv, dt);
    }
}
