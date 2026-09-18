package Lab1;

import java.util.Scanner;

public class Bai4_HinhChuNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cd, cr, cv, dt;
        System.out.print("Nhap chieu dai: ");
        cd = sc.nextDouble();
        System.out.print("Nhap chieu rong: ");
        cr = sc.nextDouble();

        cv = 2 * (cd + cr);
        dt = cd * cr;

        System.out.printf("Chieu dai: %.2f\nChieu rong: %.2f\nChu vi: %.2f\nDien tich: %.2f \n", cd, cr, cv, dt);
    }
}
