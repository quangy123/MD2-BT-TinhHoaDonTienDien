package Build;

import java.util.Scanner;

public class KhachHang {
    private String tenChuHo;
    private String soNha;
    private int maSoCongTo;

    public KhachHang() {
    }

    public KhachHang(String tenChuHo, String soNha, int maSoCongTo) {
        this.tenChuHo = tenChuHo;
        this.soNha = soNha;
        this.maSoCongTo = maSoCongTo;
    }
    public void nhapThongTin(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên chủ hộ: ");
        tenChuHo = scanner.nextLine();
        System.out.print("Nhập số nhà: ");
        soNha = scanner.nextLine();
        System.out.print("Mã số công tơ: ");
        maSoCongTo = scanner.nextInt();
    }
    public void hienThiThongTinKhachHang() {
        System.out.println("Tên chủ hộ: " + tenChuHo);
        System.out.println("Số nhà: " + soNha);
        System.out.println("Mã số công tơ: " + maSoCongTo);
    }
}
