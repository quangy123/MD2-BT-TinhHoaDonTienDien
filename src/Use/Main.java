package Use;

import Build.QuanLy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuanLy ql = new QuanLy();
        ql.nhapDanhSach(scanner);
        System.out.println("danh sách biên lai của các hộ gia đình là : ");
        ql.hienThiDanhSach();
        scanner.close();
    }
}
