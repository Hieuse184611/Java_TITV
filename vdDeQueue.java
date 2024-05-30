/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class vdDeQueue {

    public static void main(String[] args) {
        Deque dsSV = new ArrayDeque();

        dsSV.offer("TITV 1");
        dsSV.offer("Nguyen Van B");
        dsSV.offer("Nguyen Van A");
        dsSV.offer("TITV 2");
        dsSV.offerFirst("TITV 4");
        dsSV.offerLast("TITV 0");

        while (true) {
            String ten = (String) dsSV.poll();  // => lấy ra và xóa
            if (ten == null) {
                break;
            }
            //peek => lấy ra nhưng không xóa.
            System.out.println(ten);
        }
    }
}
