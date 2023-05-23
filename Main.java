public class Main {
    public static void main(String[] args) {
        QuanLyPhongHoc quanLyPhongHoc = new QuanLyPhongHoc();

        PhongHocLyThuyet lyThuyet1 = new PhongHocLyThuyet("LT001", "Nha A", 100, 20, true);
        PhongMayTinh mayTinh1 = new PhongMayTinh("MT001", "Nha B", 80, 15, 30);
        PhongThiNghiem thiNghiem1 = new PhongThiNghiem("TN001", "Nha C", 120, 25, "Hoa Hoc", 50, true);

        quanLyPhongHoc.themPhongHoc(lyThuyet1);
        quanLyPhongHoc.themPhongHoc(mayTinh1);
        quanLyPhongHoc.themPhongHoc(thiNghiem1);

        System.out.println("Danh sách phòng học:");
        quanLyPhongHoc.inDanhSachPhongHoc();

        System.out.println("\nTìm kiếm phòng học có mã phòng TN001:");
        System.out.println(quanLyPhongHoc.timPhongHoc("TN001"));

        System.out.println("\nDanh sách phòng học đạt chuẩn:");
        quanLyPhongHoc.inDanhSachPhongHocDatChuan();

        System.out.println("\nSắp xếp danh sách phòng học theo dãy nhà (tăng dần):");
        quanLyPhongHoc.sapXepTangTheoDayNha();
        quanLyPhongHoc.inDanhSachPhongHoc();

        System.out.println("\nSắp xếp danh sách phòng học theo diện tích (giảm dần):");
        quanLyPhongHoc.sapXepGiamTheoDienTich();
        quanLyPhongHoc.inDanhSachPhongHoc();

        System.out.println("\nSắp xếp danh sách phòng học theo số bóng đèn (tăng dần):");
        quanLyPhongHoc.sapXepTangTheoSoBongDen();
        quanLyPhongHoc.inDanhSachPhongHoc();

        quanLyPhongHoc.capNhatSoMayTinh("MT001", 40);

        System.out.println("\nDanh sách phòng học sau khi cập nhật số máy tính:");
        quanLyPhongHoc.inDanhSachPhongHoc();

        quanLyPhongHoc.xoaPhongHoc("LT001");

        System.out.println("\nDanh sách phòng học sau khi xóa:");
        quanLyPhongHoc.inDanhSachPhongHoc();

        quanLyPhongHoc.inTongSoPhongHoc();

        System.out.println("\nDanh sách phòng máy có 60 máy:");
        quanLyPhongHoc.inDanhSachPhongMayCo60May();
    }
}