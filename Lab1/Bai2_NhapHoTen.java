package Lab1;

import java.util.Scanner;

public class Bai2_NhapHoTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hoTen;
        int namSinh;

        System.out.print("Nhap ho ten: ");
        hoTen = sc.nextLine();
        System.out.print("Nhap nam sinh: ");
        namSinh = sc.nextInt();
        System.out.printf("Ho ten: %s \nNam sinh: %d \nTuoi: %d \n", hoTen, namSinh, 2026 - namSinh);
    }
}
