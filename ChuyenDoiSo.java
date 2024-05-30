import java.util.Scanner;

public class ChuyenDoiSo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập số nguyên dương từ bàn phím
        System.out.print("Nhập số nguyên dương: ");
        int soNguyenDuong = sc.nextInt();

        // Kiểm tra số nguyên dương
        if (soNguyenDuong < 0) {
            System.out.println("Số nhập vào không phải là số nguyên dương!");
            return;
        }

        // Chuyển đổi số thập phân sang số nhị phân
        String soNhiPhan = "";
        while (soNguyenDuong > 0) {
            int du = soNguyenDuong % 2;
            soNhiPhan = du + soNhiPhan;
            soNguyenDuong /= 2;
        }

        // In ra số nhị phân
        System.out.println("Số nhị phân: " + soNhiPhan);
    }
}
