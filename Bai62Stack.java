/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai62stack;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author GIGABYTE
 */
public class Bai62Stack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack stackChuoi = new Stack();

// stackChuoi.push("giatri") => đưa giá trị vào stack
// stackChuoi.pop() => lấy giá trị ra, xóa khỏi stack
// stackChuoi.peek() => lấy giá trị ra, nhưng không xóa khỏi stack
// stackChuoi.clear(); => xóa tất cả phần tử trong stack
// stackChuoi.contains("giatri")=> xác định giá trị có tồn tại trong stack hay không
// stackChuoi.size() => độ lớn của stack
//Vi du chuoi dao nguoc 
        System.out.println("Nhap chuoi: ");
        String s = sc.nextLine();
//TITV 
        for (int i = 0; i < s.length(); i++) {
            stackChuoi.push(s.charAt(i) + "");

        }
        System.out.println("Chuoi bi dao nguuoc: ");
        for (int i = 0; i < s.length(); i++) {
            System.out.println(stackChuoi.pop());
        }

// Vi du chuyen tu thap phan sang nhi phan 
        System.out.println("Nhap 1 so nguyen duong: ");
        Stack<String> stackSoDu = new Stack<>();
        int x = sc.nextInt();
        while (x > 0) {
            int soDu = x % 2;
            stackSoDu.push(soDu + "");
            x = x / 2;
        }
        System.out.println("So nhi phan la: ");
        int n = stackSoDu.size();
        for (int i = 0; i < n; i++) {
            System.out.println(stackSoDu.pop());

        }

    }

}
