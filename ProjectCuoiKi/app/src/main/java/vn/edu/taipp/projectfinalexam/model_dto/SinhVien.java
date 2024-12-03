package vn.edu.taipp.projectfinalexam.model_dto;


public class SinhVien implements Identifiable {

    private int MaSinhVien;
    private String HoTen;
    private String NgaySinh; // Sử dụng String cho ngày tháng
    private int GioiTinh; // 0 hoặc 1, có thể chuyển đổi thành boolean
    private String Email;
    private String SDT;
    private int TrangThai;
    private Lop lop; // Quan hệ với lớp Lop

    // Getter và Setter
    public int getMaSinhVien() {
      return MaSinhVien;
    }

    public void setMaSinhVien(int maSinhVien) {
      MaSinhVien = maSinhVien;
    }

    public String getHoTen() {
      return HoTen;
    }

    public void setHoTen(String hoTen) {
      HoTen = hoTen;
    }

    public String getNgaySinh() {
      return NgaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
      NgaySinh = ngaySinh;
    }

    public int getGioiTinh() {
      return GioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
      GioiTinh = gioiTinh;
    }

    public String getEmail() {
      return Email;
    }

    public void setEmail(String email) {
      Email = email;
    }

    public String getSDT() {
      return SDT;
    }

    public void setSDT(String SDT) {
      this.SDT = SDT;
    }

    public int getTrangThai() {
      return TrangThai;
    }

    public void setTrangThai(int trangThai) {
      TrangThai = trangThai;
    }

    public Lop getLop() {
      return lop;
    }

    public void setLop(Lop lop) {
      this.lop = lop;
    }

    @Override
    public String toString() {
      return "SinhVien{" +
              "MaSinhVien=" + MaSinhVien +
              ", HoTen='" + HoTen + '\'' +
              ", NgaySinh=" + NgaySinh +
              ", GioiTinh=" + (GioiTinh == 1 ? "Nam" : "Nữ") +
              ", Email='" + Email + '\'' +
              ", SDT='" + SDT + '\'' +
              ", TrangThai=" + TrangThai +
              ", lop=" + lop.getTenLop() +
              '}';

    }
  @Override
  public int getId() {
    return this.MaSinhVien;
  }
}
