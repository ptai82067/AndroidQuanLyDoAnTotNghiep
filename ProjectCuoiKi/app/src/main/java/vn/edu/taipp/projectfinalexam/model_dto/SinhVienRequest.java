package vn.edu.taipp.projectfinalexam.model_dto;

public class SinhVienRequest {
  private String HoTen;
  private String NgaySinh; // Định dạng yyyy-MM-dd
  private int GioiTinh;    // 0: Nữ, 1: Nam
  private String Email;
  private String SDT;
  private int TrangThai;   // 1: Hoạt động, 0: Không hoạt động
  private int MaLop;

  // Constructor
  public SinhVienRequest(String hoTen, String ngaySinh, int gioiTinh, String email, String sdt, int trangThai, int maLop) {
    HoTen = hoTen;
    NgaySinh = ngaySinh;
    GioiTinh = gioiTinh;
    Email = email;
    SDT = sdt;
    TrangThai = trangThai;
    MaLop = maLop;
  }

  // Getter và Setter
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

  public void setSDT(String sdt) {
    SDT = sdt;
  }

  public int getTrangThai() {
    return TrangThai;
  }

  public void setTrangThai(int trangThai) {
    TrangThai = trangThai;
  }

  public int getMaLop() {
    return MaLop;
  }

  public void setMaLop(int maLop) {
    MaLop = maLop;
  }

  @Override
  public String toString() {
    return "SinhVienRequest{" +
            "HoTen='" + HoTen + '\'' +
            ", NgaySinh='" + NgaySinh + '\'' +
            ", GioiTinh=" + GioiTinh +
            ", Email='" + Email + '\'' +
            ", SDT='" + SDT + '\'' +
            ", TrangThai=" + TrangThai +
            ", MaLop=" + MaLop +
            '}';
  }
}

