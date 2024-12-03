package vn.edu.taipp.projectfinalexam.model_dto;

public class HoSoBaoVe implements Identifiable {
  private int MaHoSo;
  private String TenHoSo;
  private String LinkHoSo;
  private String NgayCapNhat; // Dùng String cho ngày tháng để giữ nguyên định dạng JSON
  private DoAn do_an; // Dự án có liên quan

  // Constructor không tham số
  public HoSoBaoVe() {
  }

  // Constructor đầy đủ tham số
  public HoSoBaoVe(int maHoSo, String tenHoSo, String linkHoSo, String ngayCapNhat, DoAn do_an) {
    this.MaHoSo = maHoSo;
    this.TenHoSo = tenHoSo;
    this.LinkHoSo = linkHoSo;
    this.NgayCapNhat = ngayCapNhat;
    this.do_an = do_an;
  }

  // Getter và Setter
  public int getMaHoSo() {
    return MaHoSo;
  }

  public void setMaHoSo(int maHoSo) {
    this.MaHoSo = maHoSo;
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

  public DoAn getDo_an() {
    return do_an;
  }

  public void setDo_an(DoAn do_an) {
    this.do_an = do_an;
  }

  @Override
  public int getId() {
    return this.MaHoSo;
  }

  @Override
  public String toString() {
    return "HoSoBaoVe{" +
            "MaHoSo=" + MaHoSo +
            ", TenHoSo='" + TenHoSo + '\'' +
            ", LinkHoSo='" + LinkHoSo + '\'' +
            ", NgayCapNhat='" + NgayCapNhat + '\'' +
            ", do_an=" + (do_an != null ? do_an.getTenDoAn() : "null") +
            '}';
  }
}
