
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
public class ViDu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.println("Nhap vao chuoi: ");
        s = sc.nextLine();
        System.out.println("===============");

        // Ham length() => lay do day mang 
        System.out.println("Do dai mang S:  " + s.length());
        //ADDITION 
        int doDai = s.length();
        System.out.println("Length of array:  " + doDai);

        //Ham chartAt() => lay ra 1 ky tu tai vi tri nao 
       System.out.println("Vi tri thu 3: " + s.charAt(2));

    }

}
