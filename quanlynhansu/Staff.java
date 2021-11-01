package quanlynhansu;

import java.util.Scanner;

public abstract class Staff {
    private String maNhanVien;
    private String tenNhanVien;
    private String boPhanLamViec;
    private int tuoiNhanVien;
    private int soNgayNghiPhep;
    private double heSoLuong;
    private String ngayVaoLam;
    Scanner sc = new Scanner(System.in);

    public abstract void displayInformation();

    public Staff() {
        super();
    }

    public Staff(String maNhanVien, String tenNhanVien, int tuoiNhanVien, double heSoLuong, String ngayVaoLam,
            String boPhanLamViec, int soNgayNghiPhep) {
        super();
        this.maNhanVien = maNhanVien;
        this.tenNhanVien = tenNhanVien;
        this.tuoiNhanVien = tuoiNhanVien;
        this.heSoLuong = heSoLuong;
        this.ngayVaoLam = ngayVaoLam;
        this.boPhanLamViec = boPhanLamViec;
        this.soNgayNghiPhep = soNgayNghiPhep;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public int getTuoiNhanVien() {
        return tuoiNhanVien;
    }

    public void setTuoiNhanVien(int tuoiNhanVien) {
        this.tuoiNhanVien = tuoiNhanVien;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public String getNgayVaoLam() {
        return ngayVaoLam;
    }

    public void setNgayVaoLam(String ngayVaoLam) {
        this.ngayVaoLam = ngayVaoLam;
    }

    public String getBoPhanLamViec() {
        return boPhanLamViec;
    }

    public void setBoPhanLamViec(String boPhanLamViec) {
        this.boPhanLamViec = boPhanLamViec;
    }

    public int getSoNgayNghiPhep() {
        return soNgayNghiPhep;
    }

    public void setSoNgayNghiPhep(int soNgayNghiPhep) {
        this.soNgayNghiPhep = soNgayNghiPhep;
    }

    public void nhap() {
        System.out.print("Nhập mã nhân viên: ");
        maNhanVien = sc.nextLine();
        System.out.print("Nhập họ tên nhân viên: ");
        tenNhanVien = sc.nextLine();
        System.out.print("Nhập số tuổi nhân viên: ");
        tuoiNhanVien = sc.nextInt();
        System.out.print("Nhập hệ số lương của nhân viên: ");
        heSoLuong = sc.nextDouble();
        sc.nextLine();
        System.out.print("Nhập ngày vào làm của nhân viên: ");
        ngayVaoLam = sc.nextLine();
        System.out.print("Nhập bộ phận làm việc của nhân viên: ");
        boPhanLamViec = sc.nextLine();
        System.out.print("Nhập số ngày nghỉ phép của nhân viên: ");
        soNgayNghiPhep = sc.nextInt();
        sc.nextLine();
    }

    int luong;

    public String hienThiLuong() {
        return "";
    }
}
