/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication29;

import java.util.Scanner;

/**
 *
 * @author GIGABYTE
 */
public class JavaApplication29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("========== WELCOME ==========");
        System.out.println("__________________________");
        System.out.println("|Nhap vao so dien cua ban: ");
        System.out.println("|__________________________");

        int soDien = sc.nextInt();
        int bacDien = 0;

        if (soDien <= 50) {
            bacDien = 1;
        } else if (soDien > 50 & soDien <= 100) {
            bacDien = 2;
        } else if (soDien > 100 & soDien <= 200) {
            bacDien = 3;
        } else if (soDien > 200 & soDien <= 300) {
            bacDien = 4;
        } else if (soDien > 300 & soDien <= 400) {
            bacDien = 5;
        } else {
            bacDien = 6;
        }
                 double bac1 = 1.678 ;
        double bac2 = 1.734 ;
        double bac3 = 2.014 ;
        double bac4 = 2.536 ;
        double bac5 = 2.834 ;
        double bac6 = 2.927 ;
        double tienDien = 0 ;
         switch (bacDien) {
            case 1:
                tienDien = soDien * bac1;
                break;
            case 2:
                tienDien = 50 * bac1 + (soDien -50) * bac2;
                break;
            case 3:
                tienDien = 50 * bac1 + 50 * bac2 + (soDien-100)*bac3;
                break;
            case 4:
                tienDien = 50 * bac1 + 50 * bac2 + 100 * bac3 + (soDien-200) * bac4;
                break;
            case 5:
                tienDien = 50 * bac1 + 50 * bac2 + 100 * bac3 + 100 * bac4 + (soDien-300) * bac5;
                break;
            case 6:
                tienDien = 50 * bac1 + 50 * bac2 + 100 * bac3 + 100 * bac4 + 100 * bac5 + (soDien-400) * bac6;
                break;
            default:
                System.out.println("Bậc điện không hợp lệ");
        }
         System.out.println("Dien dien phai tra la : " + tienDien + "K vnd" );
    }
}
