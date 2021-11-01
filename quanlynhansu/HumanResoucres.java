package quanlynhansu;

import java.util.Scanner;
import java.util.ArrayList;

public class HumanResoucres {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Staff> nhanVien = new ArrayList<Staff>();
        ArrayList<Department> boPhan = new ArrayList<Department>();
        System.out.println("Quản lý nhân sự:");
        System.out.println();
        // Vòng lặp để người dùng chọn lại chức năng
        do {
            System.out.println("Chức năng:");
            System.out.println(
                    "1. Thêm bộ phận - 2. Thêm nhân viên - 3. Danh sách nhân viên - 4. Danh sách bộ phận - 5. Hiển thị nhân viên theo từng bộ phận - 6. Tìm thông tin nhân viên - 7. Hiển thị bảng lương - 8. Hiển thị bảng lương theo yêu cầu - 9. Kết thúc ");
            System.out.print("Yêu cầu: ");
            int chose = sc.nextInt();
            System.out.println();
            switch (chose) {
            // Nhập thông tin cho bộ phận
            case 1:
                System.out.println("Nhập thông tin cho bộ phận:");
                Department boPhanMoi = new Department();
                boPhan.add(boPhanMoi);
                boPhanMoi.nhapBoPhan();
                break;
            // Nhập thông tin cho nhân viên
            case 2:
                System.out.println("Nhập thông tin cho nhân viên:");
                System.out.print("Chọn loại nhân viên (1. Nhân viên - 2. Quản lí): ");
                int chon = sc.nextInt();
                if (chon == 1) {
                    Employee nhanVienMoi = new Employee();
                    nhanVien.add(nhanVienMoi);
                    nhanVienMoi.nhap();

                } else if (chon == 2) {
                    Manager nhanVienMoi = new Manager();
                    nhanVien.add(nhanVienMoi);
                    nhanVienMoi.nhap();

                }
                break;
            // Hiển thị danh sách nhân viên
            case 3:
                for (Staff obj : nhanVien) {
                    obj.displayInformation();
                    if (obj instanceof Employee) {

                    }
                }
                break;
            // Hiển thị danh sách bộ phận
            case 4:
                for (Department obj : boPhan) {
                    System.out.println(obj.toString());
                }
                break;
            // Hiển thị danh sách nhân viên theo từng bộ phận
            case 5:
                for (Department obj : boPhan) {
                    System.out.println(obj.toString());
                    for (Staff obj1 : nhanVien) {
                        if (obj.getTenBoPhan().equals(obj1.getBoPhanLamViec())) {
                            obj1.displayInformation();
                        }
                    }
                    System.out.println();
                }
                break;
            // Tìm thông tin nhân viên theo mã nhân viên hoặc họ tên nhân viên
            case 6:
                sc.nextLine();
                System.out.print("Nhập mã nhân viên hoặc họ tên nhân viên bạn muốn tìm: ");
                String timKiem = sc.nextLine();
                int i = 0;
                for (Staff obj : nhanVien) {
                    if (obj.getMaNhanVien().equalsIgnoreCase(timKiem)
                            || obj.getTenNhanVien().equalsIgnoreCase(timKiem)) {
                        obj.displayInformation();
                        i++;
                    }
                }
                if (i == 0) {
                    System.out.println("Nhân viên không tồn tại! Xin kiểm tra lại.");
                }
                break;
            // Hiển thị lương
            case 7:
                System.out.println("Bảng lương:");
                for (Staff obj : nhanVien) {
                    System.out.println(obj.hienThiLuong());
                }
                break;
            // Hiển thị lương theo yêu cầu
            case 8:
                System.out.print("Bạn muốn hiển thị bảng lương (1. Từ cao đến thấp - 2. Từ thấp đến cao): ");
                int luaChon = sc.nextInt();
                Staff temp;
                if (luaChon == 1) {
                    for (int j = 0; j < nhanVien.size() - 1; j++) {
                        for (int k = j + 1; k < nhanVien.size(); k++) {
                            if (nhanVien.get(j).luong < nhanVien.get(k).luong) {
                                temp = nhanVien.get(j);
                                nhanVien.set(j, nhanVien.get(k));
                                nhanVien.set(k, temp);
                            }
                        }
                    }
                    for (Staff obj : nhanVien) {
                        System.out.println(obj.hienThiLuong());
                    }
                } else if (luaChon == 2) {
                    for (int j = 0; j < nhanVien.size() - 1; j++) {
                        for (int k = j + 1; k < nhanVien.size(); k++) {
                            if (nhanVien.get(j).luong > nhanVien.get(k).luong) {
                                temp = nhanVien.get(j);
                                nhanVien.set(j, nhanVien.get(k));
                                nhanVien.set(k, temp);
                            }
                        }
                    }
                    for (Staff obj : nhanVien) {
                        System.out.println(obj.hienThiLuong());
                    }
                }
                break;
            }
            // Dừng chương trình
            if (chose == 9) {
                break;
            }
            System.out.println();
        } while (true);

        sc.close();
    }
}
