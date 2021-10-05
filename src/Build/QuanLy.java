package Build;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLy {
    private ArrayList<BienLai> danhSach;

    public QuanLy(){
        danhSach= new ArrayList<BienLai>(10);
    }
    public void themBienLaiVao (BienLai bienLai){
        danhSach.add(bienLai);
    }
    public void nhapDanhSach(Scanner scanner){
        BienLai bienLai;
        System.out.print("nhập số lượng biên lai: ");
        int y = scanner.nextInt();
        scanner.nextLine();
        System.out.println("nhập vào danh sách biên lai:");
        for (int i = 0; i < y; i++) {
            System.out.println("Biên lai thu"+(i+1)+" la:");
            bienLai=new BienLai();
            bienLai.nhapThongTin(scanner);
            themBienLaiVao(bienLai);
        }
    }
    public void hienThiDanhSach(){
        for (int i = 0; i < danhSach.size(); i++) {
            System.out.println("biên lai thu "+(i+1)+"là: ");
            danhSach.get(i).hienThiThongTin();
            System.out.println();
        }
    }
}
