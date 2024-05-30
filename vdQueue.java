/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author GIGABYTE
 */
public class vdQueue {
    public static void main(String[] args) {
        Queue<String> danhsachSV = new LinkedList<String>();
        
        danhsachSV.offer("TITV1");
        danhsachSV.offer("Nguyen");
        danhsachSV.offer("Van");
        danhsachSV.offer("Tran");
        danhsachSV.offer("Pham");
        
        
        while(true){
            String ten = danhsachSV.poll();// poll = lay ra va xoa
            if(ten==null){
                break;
            }
        //peek = lay ra nhung khong xoa
            System.out.println(ten);
        }
    }
    
}
