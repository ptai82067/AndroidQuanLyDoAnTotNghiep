package vn.edu.taipp.projectfinalexam.model_dto;

public class ChamDiem implements Identifiable {
  private int MaChamDiem;
  private double Diem;
  private String NhanXet;
  private String NgayChamDiem; // Dùng String cho ngày tháng để giữ nguyên định dạng JSON
  private DoAn do_an;
  private GiangVien giang_vien;

  // Constructor không tham số
  public ChamDiem() {
  }

  // Constructor đầy đủ tham số
  public ChamDiem(int maChamDiem, double diem, String nhanXet, String ngayChamDiem, DoAn do_an, GiangVien giang_vien) {
    this.MaChamDiem = maChamDiem;
    this.Diem = diem;
    this.NhanXet = nhanXet;
    this.NgayChamDiem = ngayChamDiem;
    this.do_an = do_an;
    this.giang_vien = giang_vien;
  }

  // Getter và Setter
  public int getMaChamDiem() {
    return MaChamDiem;
  }

  public void setMaChamDiem(int maChamDiem) {
    this.MaChamDiem = maChamDiem;
  }

  public double getDiem() {
    return Diem;
  }

  public void setDiem(double diem) {
    this.Diem = diem;
  }

  public String getNhanXet() {
    return NhanXet;
  }

  public void setNhanXet(String nhanXet) {
    this.NhanXet = nhanXet;
  }

  public String getNgayChamDiem() {
    return NgayChamDiem;
  }

  public void setNgayChamDiem(String ngayChamDiem) {
    this.NgayChamDiem = ngayChamDiem;
  }

  public DoAn getDo_an() {
    return do_an;
  }

  public void setDo_an(DoAn do_an) {
    this.do_an = do_an;
  }

  public GiangVien getGiang_vien() {
    return giang_vien;
  }

  public void setGiang_vien(GiangVien giang_vien) {
    this.giang_vien = giang_vien;
  }

  @Override
  public int getId() {
    return this.MaChamDiem;
  }

  @Override
  public String toString() {
    return "ChamDiem{" +
            "MaChamDiem=" + MaChamDiem +
            ", Diem=" + Diem +
            ", NhanXet='" + NhanXet + '\'' +
            ", NgayChamDiem='" + NgayChamDiem + '\'' +
            ", do_an=" + (do_an != null ? do_an.getTenDoAn() : "null") +
            ", giang_vien=" + (giang_vien != null ? giang_vien.getHoTen() : "null") +
            '}';
  }
}
