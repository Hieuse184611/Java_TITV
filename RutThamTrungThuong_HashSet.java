/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai64setstructure;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author GIGABYTE
 */
public class RutThamTrungThuong_HashSet {

    Set<String> thungPhieuDuThuong = new HashSet<String>();

    public RutThamTrungThuong_HashSet() {
    }

    public boolean themPhieu(String giaTri) {
        return this.thungPhieuDuThuong.add(giaTri);
    }

    public boolean xoaPhieu(String giaTri) {
        return this.thungPhieuDuThuong.remove(giaTri);
    }

    public boolean kTraPhieu(String giaTri) {
        return this.thungPhieuDuThuong.contains(giaTri);
    }

    public void xoaAllPhieu() {
        this.thungPhieuDuThuong.clear();
    }

    public int laySoLuong() {
        return this.thungPhieuDuThuong.size();
    }

    public String rutTham() {
        String ketQua = "";
        Random rd = new Random();
        int viTri = rd.nextInt(this.thungPhieuDuThuong.size());
        ketQua = (String) this.thungPhieuDuThuong.toArray()[viTri];
        return ketQua;
    }

    public void inAll() {
        System.out.println(Arrays.toString(this.thungPhieuDuThuong.toArray()));
    }

    public static void main(String[] args) {
        int luaChon = 0;
        Scanner sc = new Scanner(System.in);
        RutThamTrungThuong_HashSet rt = new RutThamTrungThuong_HashSet();

        do {
            System.out.println("======================");
            System.out.println("MENU");
            System.out.println("1. Thêm mã số dự thưởng.");
            System.out.println("2. Xóa mã số dự thưởng.");
            System.out.println("3. Kiểm tra mã số dự thưởng có tồn tại hay không?");
            System.out.println("4. Xóa tất cả các phiếu dự thưởng.");
            System.out.println("5. Số lượng phiếu dự thưởng.");
            System.out.println("6. Rút thăm trúng thưởng.");
            System.out.println("7. In ra tất cả các phiếu.");
            System.out.println("0. Thoát khỏi chương trình");
            luaChon = sc.nextInt();
            sc.nextLine();

            if (luaChon == 1 || luaChon == 2 || luaChon == 3) {
                System.out.println("Nhap ma:  ");
                String giaTri = sc.nextLine();
                if (luaChon == 1) {
                    rt.themPhieu(giaTri);
                } else if (luaChon == 2) {
                    rt.xoaPhieu(giaTri);
                }
             else 
                System.out.println("Ket qua kiem tra : " + rt.kTraPhieu(giaTri));
                

            }else if(luaChon == 4 ) {
				rt.xoaAllPhieu();
			}else if(luaChon==5) {
				System.out.println("Số lượng phiếu là: "+ rt.laySoLuong());
			}else if(luaChon==6) {
				System.out.println("Mã số trúng thưởng là: "+ rt.rutTham());
			}else if(luaChon==7) {
				System.out.println("Các mã phiếu dự thưởng là: ");
				rt.inAll();
                        }  
       
        } while (luaChon != 0);
    }
}

