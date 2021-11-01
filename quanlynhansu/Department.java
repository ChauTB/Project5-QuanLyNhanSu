package quanlynhansu;

import java.util.Scanner;

public class Department {
    private String maBoPhan;
    private String tenBoPhan;
    private int soLuongNhanVien;

    Scanner sc = new Scanner(System.in);

    public Department() {
        super();
    }

    public Department(String maBoPhan, String tenBoPhan, int soLuongNhanVien) {
        super();
        this.maBoPhan = maBoPhan;
        this.tenBoPhan = tenBoPhan;
        this.soLuongNhanVien = soLuongNhanVien;
    }

    public String getMaBoPhan() {
        return maBoPhan;
    }

    public void setMaBoPhan(String maBoPhan) {
        this.maBoPhan = maBoPhan;
    }

    public String getTenBoPhan() {
        return tenBoPhan;
    }

    public void setTenBoPhan(String tenBoPhan) {
        this.tenBoPhan = tenBoPhan;
    }

    public int getSoLuongNhanVien() {
        return soLuongNhanVien;
    }

    public void setSoLuongNhanVien(int soLuongNhanVien) {
        this.soLuongNhanVien = soLuongNhanVien;
    }

    public void nhapBoPhan() {
        System.out.print("Nhập mã bộ phận: ");
        this.maBoPhan = sc.nextLine();
        System.out.print("Nhập tên bộ phận: ");
        this.tenBoPhan = sc.nextLine();
        System.out.print("Nhập số lượng nhân viên: ");
        this.soLuongNhanVien = sc.nextInt();
    }

    public String toString() {
        return "Mã bộ phận: " + this.maBoPhan + ". Tên bộ phận: " + this.tenBoPhan + ". Số lượng nhân viên: "
                + this.soLuongNhanVien;
    }
}
