package quanlynhansu;

public class Manager extends Staff implements ICalculator {
    private String chucDanh;

    public Manager() {
        super();
    }

    public Manager(String chucDanh) {
        super();
        this.chucDanh = chucDanh;
    }

    public String getChucDanh() {
        return chucDanh;
    }

    public void setChucDanh(String chucDanh) {
        this.chucDanh = chucDanh;
    }

    @Override
    public void nhap() {
        super.nhap();
        System.out.print("Nhập chức danh: ");
        chucDanh = sc.nextLine();
    }

    @Override
    public int tinhLuong() {
        if (this.chucDanh.equalsIgnoreCase("Business Leader")) {
            luong = (int) (getHeSoLuong() * 5_000_000 + 8000000);
        } else if (this.chucDanh.equalsIgnoreCase("Project Leader")) {
            luong = (int) (getHeSoLuong() * 5000000 + 5000000);
        } else if (this.chucDanh.equalsIgnoreCase("Technical Leader")) {
            luong = (int) (getHeSoLuong() * 5000000 + 6000000);
        }
        return luong;
    }

    @Override
    public void displayInformation() {
        System.out.println(
                "Mã nhân viên: " + getMaNhanVien() + ". Họ tên nhân viên: " + getTenNhanVien() + ". Chức danh: "
                        + this.chucDanh + ". Hệ số lương: " + getHeSoLuong() + ". Ngày vào làm: " + getNgayVaoLam()
                        + ". Bộ phận làm việc: " + getBoPhanLamViec() + ". Số ngày nghỉ phép: " + getSoNgayNghiPhep());

    }

    @Override
    public String hienThiLuong() {
        return "Mã nhân viên: " + getMaNhanVien() + ". Họ tên nhân viên: " + getTenNhanVien() + ". Chức danh: "
                + this.chucDanh + ". Tiền lương: " + tinhLuong();
    }

}
