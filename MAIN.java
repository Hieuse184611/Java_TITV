
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author GIGABYTE
 */
public class MAIN {

    public static void main(String[] args) {
        TuDien tuDien = new TuDien();
        int luaChon = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println(" ");
            System.out.println("--- MENU ---");
            System.out.println("TTRA TU DIEN  ");
            System.out.println("Tra từ điển Anh - Việt:\n"
                    + "1. Thêm từ (Từ khóa, Ý nghĩa)\n"
                    + "2. Xóa từ\n"
                    + "3. Tìm ý nghĩa của từ khóa ⇒ Tra từ\n"
                    + "4. In ra danh sách từ khóa\n"
                    + "5. Lấy số lượng từ\n"
                    + "6. Xóa tất cả các từ khóa\n"
                    + "0. Thoát khỏi chương trình\n"
                    + "");
            luaChon = sc.nextInt();
            sc.nextLine();

            if (luaChon == 1) {
                System.out.println("Them tu moi \n");
                System.out.println("Them tu khoa");
                String tuKhoa = sc.nextLine();
                System.out.println("Them y nghia");
                String yNghia = sc.nextLine();
                tuDien.themTu(tuKhoa, yNghia);
            } else if (luaChon == 2) {
                System.out.println("Nhap tu khoa:");
                String tuKhoa = sc.nextLine();
                tuDien.xoaTu(tuKhoa);

            } else if (luaChon == 3) {
                System.out.println("Nhap tu khoa ");
                String tuKhoa = sc.nextLine();
                System.out.println("Nghia cua tu la: " + tuDien.traTu(tuKhoa)) ;
            
            } else if (luaChon == 4) {
                System.out.println("In ra cac tu  ");
                tuDien.inTuKhoa();
            
            } else if (luaChon == 5) {
                System.out.println("SO luong tu:  "+tuDien.soLuongTu());
                            
            } else if (luaChon == 6) {
                System.out.println("Xoa tat ca tu  ");
                tuDien.xoaAllTu();
            }

        } while (luaChon != 0);
    }

}
