package quanlynhansu;

public class Employee extends Staff implements ICalculator {
    private int soGioLamThem;

    public Employee() {
        super();
    }

    public Employee(int soGioLamThem) {
        super();
        this.soGioLamThem = soGioLamThem;
    }

    public int getSoGioLamThem() {
        return soGioLamThem;
    }

    public void setSoGioLamThem(int soGioLamThem) {
        this.soGioLamThem = soGioLamThem;
    }

    @Override
    public void nhap() {
        super.nhap();
        System.out.print("Nhập số giờ làm thêm: ");
        soGioLamThem = sc.nextInt();
    }

    public int calculateSalary() {
        luong = (int) (this.soGioLamThem * 200000 + getHeSoLuong() * 3000000);
        return luong;
    }

    @Override
    public int tinhLuong() {

        return calculateSalary();
    }

    @Override
    public void displayInformation() {
        System.out.println("Mã nhân viên: " + getMaNhanVien() + ". Họ tên nhân viên: " + getTenNhanVien()
                + ". Hệ số lương: " + getHeSoLuong() + ". Ngày vào làm: " + getNgayVaoLam() + ". Bộ phận làm việc: "
                + getBoPhanLamViec() + ". Số ngày nghỉ phép: " + getSoNgayNghiPhep());
    }

    @Override
    public String hienThiLuong() {
        return "Mã nhân viên: " + getMaNhanVien() + ". Họ tên nhân viên: " + getTenNhanVien() + ". Số giờ làm thêm: "
                + this.soGioLamThem + ". Tiền lương: " + tinhLuong();

    }
}
