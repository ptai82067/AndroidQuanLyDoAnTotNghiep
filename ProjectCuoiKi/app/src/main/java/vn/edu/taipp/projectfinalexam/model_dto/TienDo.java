package vn.edu.taipp.projectfinalexam.model_dto;

public class TienDo implements Identifiable {
  private int MaTienDo;
  private String MoTa;
  private String TrangThai;
  private String NgayCapNhat; // Thay vì kiểu Date, sử dụng String để giữ nguyên định dạng ngày tháng
  private DoAn do_an;

  // Constructor không tham số
  public TienDo() {
  }

  // Constructor đầy đủ tham số
  public TienDo(int maTienDo, String moTa, String trangThai, String ngayCapNhat, DoAn do_an) {
    this.MaTienDo = maTienDo;
    this.MoTa = moTa;
    this.TrangThai = trangThai;
    this.NgayCapNhat = ngayCapNhat;
    this.do_an = do_an;
  }

  // Getter và Setter
  public int getMaTienDo() {
    return MaTienDo;
  }

  public void setMaTienDo(int maTienDo) {
    this.MaTienDo = maTienDo;
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

  public DoAn getDo_an() {
    return do_an;
  }

  public void setDo_an(DoAn do_an) {
    this.do_an = do_an;
  }

  @Override
  public int getId() {
    return this.MaTienDo;
  }

  @Override
  public String toString() {
    return "TienDo{" +
            "MaTienDo=" + MaTienDo +
            ", MoTa='" + MoTa + '\'' +
            ", TrangThai='" + TrangThai + '\'' +
            ", NgayCapNhat='" + NgayCapNhat + '\'' +
            ", do_an=" + (do_an != null ? do_an.getTenDoAn() : "null") +
            '}';
  }
}
