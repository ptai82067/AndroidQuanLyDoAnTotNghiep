package vn.edu.taipp.projectfinalexam.model_dto;

public class ThongBao implements Identifiable {
  private int MaThongBao;
  private String TieuDe;
  private String NoiDung;
  private String NgayTao; // Dùng String cho ngày tháng để giữ nguyên định dạng JSON
  private int MaNguoiTao;
  private String EmailNguoiNhan;
  private GiangVien giang_vien; // Giảng viên tạo thông báo

  // Constructor không tham số
  public ThongBao() {
  }

  // Constructor đầy đủ tham số
  public ThongBao(int maThongBao, String tieuDe, String noiDung, String ngayTao, int maNguoiTao, String emailNguoiNhan, GiangVien giang_vien) {
    this.MaThongBao = maThongBao;
    this.TieuDe = tieuDe;
    this.NoiDung = noiDung;
    this.NgayTao = ngayTao;
    this.MaNguoiTao = maNguoiTao;
    this.EmailNguoiNhan = emailNguoiNhan;
    this.giang_vien = giang_vien;
  }

  // Getter và Setter
  public int getMaThongBao() {
    return MaThongBao;
  }

  public void setMaThongBao(int maThongBao) {
    this.MaThongBao = maThongBao;
  }

  public String getTieuDe() {
    return TieuDe;
  }

  public void setTieuDe(String tieuDe) {
    this.TieuDe = tieuDe;
  }

  public String getNoiDung() {
    return NoiDung;
  }

  public void setNoiDung(String noiDung) {
    this.NoiDung = noiDung;
  }

  public String getNgayTao() {
    return NgayTao;
  }

  public void setNgayTao(String ngayTao) {
    this.NgayTao = ngayTao;
  }

  public int getMaNguoiTao() {
    return MaNguoiTao;
  }

  public void setMaNguoiTao(int maNguoiTao) {
    this.MaNguoiTao = maNguoiTao;
  }

  public String getEmailNguoiNhan() {
    return EmailNguoiNhan;
  }

  public void setEmailNguoiNhan(String emailNguoiNhan) {
    this.EmailNguoiNhan = emailNguoiNhan;
  }

  public GiangVien getGiang_vien() {
    return giang_vien;
  }

  public void setGiang_vien(GiangVien giang_vien) {
    this.giang_vien = giang_vien;
  }

  @Override
  public int getId() {
    return this.MaThongBao;
  }

  @Override
  public String toString() {
    return "ThongBao{" +
            "MaThongBao=" + MaThongBao +
            ", TieuDe='" + TieuDe + '\'' +
            ", NoiDung='" + NoiDung + '\'' +
            ", NgayTao='" + NgayTao + '\'' +
            ", MaNguoiTao=" + MaNguoiTao +
            ", EmailNguoiNhan='" + EmailNguoiNhan + '\'' +
            ", giang_vien=" + (giang_vien != null ? giang_vien.getHoTen() : "null") +
            '}';
  }
}
