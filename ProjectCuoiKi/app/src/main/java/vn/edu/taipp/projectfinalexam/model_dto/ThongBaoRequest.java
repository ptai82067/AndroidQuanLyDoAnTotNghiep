package vn.edu.taipp.projectfinalexam.model_dto;

public class ThongBaoRequest {
  private String TieuDe;  // Tiêu đề không được để trống, tối đa 191 ký tự
  private String NoiDung;  // Nội dung không được để trống
  private String NgayTao;  // Ngày tạo phải là một ngày hợp lệ (kiểu String)
  private int MaNguoiTao;  // Phải tồn tại trong bảng GiangVien
  private String EmailNguoiNhan;  // Email người nhận, phải là email hợp lệ và tối đa 191 ký tự

  // Constructor không tham số
  public ThongBaoRequest() {
  }

  // Constructor đầy đủ tham số
  public ThongBaoRequest(String tieuDe, String noiDung, String ngayTao, int maNguoiTao, String emailNguoiNhan) {
    this.TieuDe = tieuDe;
    this.NoiDung = noiDung;
    this.NgayTao = ngayTao;
    this.MaNguoiTao = maNguoiTao;
    this.EmailNguoiNhan = emailNguoiNhan;
  }

  // Getter và Setter
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

  @Override
  public String toString() {
    return "ThongBaoRequest{" +
            "TieuDe='" + TieuDe + '\'' +
            ", NoiDung='" + NoiDung + '\'' +
            ", NgayTao='" + NgayTao + '\'' +
            ", MaNguoiTao=" + MaNguoiTao +
            ", EmailNguoiNhan='" + EmailNguoiNhan + '\'' +
            '}';
  }
}
