
import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author PC
 */
public class Test {

    public static void main(String[] args) {
        String s = "Xin chao cac ban!!! ";
        String a[] = s.split(" ");
        System.out.println(Arrays.toString(a));

        String b[] = s.split(",");
        System.out.println(Arrays.toString(b));

        System.out.println("-----");
        String c = "Xin chao, minh la Peter. Minh la sinh vien !!";
        System.out.println(c);
        String c0[] = c.split("\\,|\\.");
        System.out.println(Arrays.toString(c0));
        System.out.println("-----");
        
        String s01 = "Nguyen Van A";
        String s02 = "Nguyen Van BA";
        String s03 = "Tran CD";
        
        String s010[] = s01.split(" ");
        System.out.println(Arrays.toString(s010));
       
        String s020[] = s02.split(",",1);
        System.out.println(Arrays.toString(s020));
        
        String s0200[] = s02.split(" ");
        System.out.println("Ten: " +s0200[s0200.length-1]);
        
    
    }

}
