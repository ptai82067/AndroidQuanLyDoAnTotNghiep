package vn.edu.taipp.projectfinalexam.model_dto;

public class BaiVietRequest {
  private String TieuDe; // Bắt buộc, tối đa 191 ký tự
  private String NoiDung; // Bắt buộc
  private String NgayTao; // Bắt buộc, phải là ngày hợp lệ
  private int MaNguoiTao; // Bắt buộc, phải tồn tại trong bảng GiangVien
  private String TinhTrang; // Tùy chọn, tối đa 50 ký tự

  // Constructor không tham số
  public BaiVietRequest() {
  }

  // Constructor đầy đủ tham số
  public BaiVietRequest(String tieuDe, String noiDung, String ngayTao, int maNguoiTao ) {
    this.TieuDe = tieuDe;
    this.NoiDung = noiDung;
    this.NgayTao = ngayTao;
    this.MaNguoiTao = maNguoiTao;
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

  public String getTinhTrang() {
    return TinhTrang;
  }

  public void setTinhTrang(String tinhTrang) {
    this.TinhTrang = tinhTrang;
  }

  @Override
  public String toString() {
    return "BaiVietRequest{" +
            "TieuDe='" + TieuDe + '\'' +
            ", NoiDung='" + NoiDung + '\'' +
            ", NgayTao='" + NgayTao + '\'' +
            ", MaNguoiTao=" + MaNguoiTao +
            ", TinhTrang='" + TinhTrang + '\'' +
            '}';
  }
}
