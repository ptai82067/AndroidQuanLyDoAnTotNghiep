package vn.edu.taipp.projectfinalexam.model_dto;

public class TienDoRequest {
  private Integer MaDoAn; // Đảm bảo rằng mã đồ án tồn tại trong bảng DoAn
  private String MoTa;    // Có thể rỗng, tối đa 191 ký tự
  private String TrangThai; // Trạng thái là chuỗi bắt buộc, tối đa 50 ký tự
  private String NgayCapNhat; // Dùng kiểu String cho ngày tháng

  // Constructor không tham số
  public TienDoRequest() {
  }

  // Constructor đầy đủ tham số
  public TienDoRequest(Integer maDoAn, String moTa, String trangThai, String ngayCapNhat) {
    this.MaDoAn = maDoAn;
    this.MoTa = moTa;
    this.TrangThai = trangThai;
    this.NgayCapNhat = ngayCapNhat;
  }

  // Getter và Setter
  public Integer getMaDoAn() {
    return MaDoAn;
  }

  public void setMaDoAn(Integer maDoAn) {
    this.MaDoAn = maDoAn;
  }

  public String getMoTa() {
    return MoTa;
  }

  public void setMoTa(String moTa) {
    this.MoTa = moTa;
  }

  public String getTrangThai() {
    return TrangThai;
  }

  public void setTrangThai(String trangThai) {
    this.TrangThai = trangThai;
  }

  public String getNgayCapNhat() {
    return NgayCapNhat;
  }

  public void setNgayCapNhat(String ngayCapNhat) {
    this.NgayCapNhat = ngayCapNhat;
  }

  @Override
  public String toString() {
    return "TienDoRequest{" +
            "MaDoAn=" + MaDoAn +
            ", MoTa='" + MoTa + '\'' +
            ", TrangThai='" + TrangThai + '\'' +
            ", NgayCapNhat='" + NgayCapNhat + '\'' +
            '}';
  }
}
