package Build;

import java.util.Scanner;

public class BienLai extends KhachHang{
    private int chiSoMoi;
    private int chiSoCu;
    double soTienCanThanhToan;

    public BienLai(){
    }

    public BienLai(int chiSoMoi,int chiSoCu,int soTienCanThanhToan) {
        this.chiSoMoi = chiSoMoi;
        this.chiSoCu = chiSoCu;
        this.soTienCanThanhToan = soTienCanThanhToan;
    }

    public BienLai(String tenChuHo, String soNha, int maSoCongTo, int chiSoMoi,int chiSoCu,int soTienCanThanhToan) {
        super(tenChuHo, soNha, maSoCongTo);
        this.chiSoMoi = chiSoMoi;
        this.chiSoCu = chiSoCu;
        this.soTienCanThanhToan = soTienCanThanhToan;

    }
    public void nhapThongTin(Scanner scanner){
        super.nhapThongTin();
        System.out.println("Nhập chỉ số mới:");
        chiSoMoi=scanner.nextInt();

        scanner.nextLine();
        System.out.println("Nhập chỉ số cũ:");
        chiSoCu=scanner.nextInt();

        scanner.nextLine();
        soTienCanThanhToan = (chiSoMoi-chiSoCu)*750;

    }
    public void hienThiThongTin(){
        super.hienThiThongTinKhachHang();
        System.out.println("\tchi số mới : "+chiSoMoi);
        System.out.println("\tchi số cũ : "+chiSoCu);
        System.out.println("\tso tiền cần phải thanh toán : "+soTienCanThanhToan);
    }
}
