import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class QuanLyPhongHoc {
    private List<PhongHoc> danhSachPhongHoc;

    public QuanLyPhongHoc() {
        danhSachPhongHoc = new ArrayList<>();
    }

    public void themPhongHoc(PhongHoc phongHoc) {
        if (!danhSachPhongHoc.contains(phongHoc)) {
            danhSachPhongHoc.add(phongHoc);
            System.out.println("Thêm phòng học thành công.");
        } else {
            System.out.println("Phòng học đã tồn tại.");
        }
    }

    public PhongHoc timPhongHoc(String maPhong) {
        for (PhongHoc phongHoc : danhSachPhongHoc) {
            if (phongHoc.getMaPhong().equals(maPhong)) {
                return phongHoc;
            }
        }
        return null;
    }

    public void inDanhSachPhongHoc() {
        for (PhongHoc phongHoc : danhSachPhongHoc) {
            System.out.println(phongHoc);
        }
    }

    public void inDanhSachPhongHocDatChuan() {
        for (PhongHoc phongHoc : danhSachPhongHoc) {
            if (phongHoc instanceof PhongHocLyThuyet) {
                PhongHocLyThuyet lyThuyet = (PhongHocLyThuyet) phongHoc;
                if (lyThuyet.isCoMayChieu() && phongHoc.getSoBongDen() >= 10) {
                    System.out.println(phongHoc);
                }
            } else if (phongHoc instanceof PhongMayTinh) {
                PhongMayTinh mayTinh = (PhongMayTinh) phongHoc;
                if (mayTinh.getSoMayTinh() >= 1 && phongHoc.getSoBongDen() >= 10) {
                    System.out.println(phongHoc);
                }
            } else if (phongHoc instanceof PhongThiNghiem) {
                PhongThiNghiem thiNghiem = (PhongThiNghiem) phongHoc;
                if (thiNghiem.isCoBonRua() && phongHoc.getSoBongDen() >= 10) {
                    System.out.println(phongHoc);
                }
            }
        }
    }

    public void sapXepTangTheoDayNha() {
        Collections.sort(danhSachPhongHoc, Comparator.comparing(PhongHoc::getDayNha));
    }

    public void sapXepGiamTheoDienTich() {
        Collections.sort(danhSachPhongHoc, Comparator.comparing(PhongHoc::getDienTich).reversed());
    }

    public void sapXepTangTheoSoBongDen() {
        Collections.sort(danhSachPhongHoc, Comparator.comparing(PhongHoc::getSoBongDen));
    }

    public void capNhatSoMayTinh(String maPhong, int soMayTinhMoi) {
        PhongHoc phongHoc = timPhongHoc(maPhong);
        if (phongHoc instanceof PhongMayTinh) {
            PhongMayTinh mayTinh = (PhongMayTinh) phongHoc;
            mayTinh.setSoMayTinh(soMayTinhMoi);
            System.out.println("Cập nhật số máy tính thành công.");
        } else {
            System.out.println("Phòng không phải là phòng máy tính.");
        }
    }

    public void xoaPhongHoc(String maPhong) {
        PhongHoc phongHoc = timPhongHoc(maPhong);
        if (phongHoc != null) {
            danhSachPhongHoc.remove(phongHoc);
            System.out.println("Xóa phòng học thành công.");
        } else {
            System.out.println("Không tìm thấy phòng học có mã phòng " + maPhong);
        }
    }

    public void inTongSoPhongHoc() {
        System.out.println("Tổng số phòng học: " + danhSachPhongHoc.size());
    }

    public void inDanhSachPhongMayCo60May() {
        for (PhongHoc phongHoc : danhSachPhongHoc) {
            if (phongHoc instanceof PhongMayTinh) {
                PhongMayTinh mayTinh = (PhongMayTinh) phongHoc;
                if (mayTinh.getSoMayTinh() == 60) {
                    System.out.println(phongHoc);
                }
            }
        }
    }
}