package main;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class vdPriorityQueue {
	public static void main(String[] args) {
		Queue dsSV = new PriorityQueue();
		
		dsSV.offer("TITV 1");
		dsSV.offer("Nguyen Van B");
		dsSV.offer("Nguyen Van A");
		dsSV.offer("TITV 2");
		
		while(true) {
			String ten = (String) dsSV.poll();  // => lấy ra và xóa
			if(ten==null) {
				break;
			}
			//peek => lấy ra nhưng không xóa.
			System.out.println(ten);
		}
	}
}