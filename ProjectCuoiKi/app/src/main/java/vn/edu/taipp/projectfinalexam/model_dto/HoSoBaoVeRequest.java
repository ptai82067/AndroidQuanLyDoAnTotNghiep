package vn.edu.taipp.projectfinalexam.model_dto;

public class HoSoBaoVeRequest {
  private int MaDoAn;  // Phải tồn tại trong bảng DoAn
  private String TenHoSo;  // Tên hồ sơ không được để trống, tối đa 191 ký tự
  private String LinkHoSo;  // Link hồ sơ bắt buộc là URL hợp lệ, tối đa 191 ký tự
  private String NgayCapNhat;  // Ngày cập nhật phải là một ngày hợp lệ

  // Constructor không tham số
  public HoSoBaoVeRequest() {
  }

  // Constructor đầy đủ tham số
  public HoSoBaoVeRequest(int maDoAn, String tenHoSo, String linkHoSo, String ngayCapNhat) {
    this.MaDoAn = maDoAn;
    this.TenHoSo = tenHoSo;
    this.LinkHoSo = linkHoSo;
    this.NgayCapNhat = ngayCapNhat;
  }

  // Getter và Setter
  public int getMaDoAn() {
    return MaDoAn;
  }

  public void setMaDoAn(int maDoAn) {
    this.MaDoAn = maDoAn;
  }

  public String getTenHoSo() {
    return TenHoSo;
  }

  public void setTenHoSo(String tenHoSo) {
    this.TenHoSo = tenHoSo;
  }

  public String getLinkHoSo() {
    return LinkHoSo;
  }

  public void setLinkHoSo(String linkHoSo) {
    this.LinkHoSo = linkHoSo;
  }

  public String getNgayCapNhat() {
    return NgayCapNhat;
  }

  public void setNgayCapNhat(String ngayCapNhat) {
    this.NgayCapNhat = ngayCapNhat;
  }

  @Override
  public String toString() {
    return "HoSoBaoVeRequest{" +
            "MaDoAn=" + MaDoAn +
            ", TenHoSo='" + TenHoSo + '\'' +
            ", LinkHoSo='" + LinkHoSo + '\'' +
            ", NgayCapNhat='" + NgayCapNhat + '\'' +
            '}';
  }
}
