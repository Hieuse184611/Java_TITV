
import java.io.File;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GIGABYTE
 */
public class Main {

    public static void main(String[] args) {
        // Lưu ý:
        // MS Windows: \ => \\ | Ví dụ: "C:\\Thu muc 1\\Thuc muc\\Ten tap tin.xxx";
        // Linux, MacOS: / | Ví dụ: /Thu muc 1/Thuc muc 2 /Ten tap tin.xxx"

        
        // Kiem tra thu muc or tap tin co ton tai 
        File folder1 = new File("D:\\Document_D\\NetBeansProjects\\bai67_File");
        System.out.println("Kiem tra folder co ton tai: " + folder1.exists());
        
       // Tạo thư mục
		// Phương thức mkdir() => Tạo 1 thư mục
		File d1 = new File("D:\\Document_D\\NetBeansProjects\\Folder001");
		d1.mkdir();
		
		// Phương thức mkdirs() => Tạo nhiều thư mục cùng lúc
		File d2 = new File("D:\\Document_D\\NetBeansProjects\\Folder001\\Folder002\\Folder003");
		//d2.mkdir();
		d2.mkdirs();
		
		// Tạo tập tin (có phần mở rộng: .exe, .txt, .doc, .xls .....)
		File file1 = new File("D:\\Document_D\\NetBeansProjects\\Folder001\\Demo.txt");
		File file2 = new File("D:\\Document_D\\NetBeansProjects\\Folder001\\Vidu.txt");
		try {
			file1.createNewFile();
			file2.createNewFile();
		} catch (IOException e) {
            // Không có quyền tạo tập tin
            // Ổ cứng bị đầy
            // Đường dẫn sai
 
		}
    }

}
