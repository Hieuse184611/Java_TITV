
import java.io.File;
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
public class viduFile {

    File file;

    public viduFile() {
    }

    public viduFile(String tenFile) {
        this.file = new File(tenFile);

    }

    public boolean ktraThucThi() {
        // KIEM TRA FILE CO THE THUC THI 
        return this.file.canExecute();
    }

    public boolean ktraDoc() {
        // KIEM TRA FILE CO THE DOC
        return this.file.canRead();
    }

    public boolean ktraGhi() {
        // KIEM TRA FILE CO THE GHI
        return this.file.canWrite();
    }

    public void inLink() {
        System.out.println(this.file.getAbsolutePath());
    }

    public void inTen() {
        System.out.println(this.file.getName());
    }

    public void ktraThuMucTapTin() {
        if (this.file.isDirectory()) {
            System.out.println("Day la thu muc ");
        } else if (this.file.isFile()) {
            System.out.println("Day la file ");
        }
    }

    public void inFileCon() {
        if (this.file.isDirectory()) {
            System.out.println("Cac tap tin con:  ");
            File mangCon[] = this.file.listFiles();
            for (File file : mangCon) {
                System.out.println(file.getAbsoluteFile());
            }
        } else if (this.file.isFile()) {
            System.out.println("Day la tap tin khong phai du lieu con ");

        }
    }

    public void inChiTietCayThuMuc(File f, int bac) {
        System.out.print("|");
        for (int i = 0; i < bac; i++) {
            System.out.print("\t");
        }
        System.out.print("|__");
        System.out.println(f.getName());
        if (f.canRead() && f.isDirectory()) {
            File[] mangCon = f.listFiles();
            for (File fx : mangCon) {
                inChiTietCayThuMuc(fx, bac + 1);
            }
        }

    }

    public void inCayThuMuc() {
        this.inChiTietCayThuMuc(this.file, 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Ten File");
        String tenFile = sc.nextLine();
        viduFile vdf = new viduFile(tenFile);
        int luaChon = 0;
        do {
            System.out.println("\nMENU ---------- ");
            System.out.println("1. Kiểm tra file có thể thực thi: ");
            System.out.println("2. Kiểm tra file có thể đọc: ");
            System.out.println("3. Kiểm tra file có thể ghi: ");
            System.out.println("4. In đường dẫn: ");
            System.out.println("5. In tên file: ");
            System.out.println("6. Kiểm tra file là thư mục hoặc tập tin: ");
            System.out.println("7. In ra danh sách các file con: ");
            System.out.println("8. In ra cây thư mục: ");
            System.out.println("0. Thoát chương trình.");
            luaChon = sc.nextInt();
            switch (luaChon) {
                case 1:
                    System.out.println("Kiem tra co thu thi ?");
                    System.out.println(vdf.ktraThucThi());
                    break;
                case 2:
                    System.out.println("Kiem tra file co Doc ?");
                    System.out.println(vdf.ktraDoc());
                    break;
                case 3:
                    System.out.println("Kiem Tra filr co GHI");
                    System.out.println(vdf.ktraGhi());
                    break;
                case 4:
                    System.out.println("In duong dan ");
                    System.out.println(vdf.ktraThucThi());
                    break;
                case 5:

                    System.out.println("In ten file");
                    vdf.inTen();
                    break;
                case 6:
                    System.out.println("Kiem tra thu muc or tap tin ");
                    vdf.ktraThuMucTapTin();
                    break;
                case 7:
                    System.out.println("IN ra danh sach file con ");
                    vdf.inFileCon();
                    break;
                case 8:
                    System.out.println("In ra cay thu muc ");
                    vdf.inCayThuMuc();
                    break;

            }

        } while (luaChon != 0);
    }

}
