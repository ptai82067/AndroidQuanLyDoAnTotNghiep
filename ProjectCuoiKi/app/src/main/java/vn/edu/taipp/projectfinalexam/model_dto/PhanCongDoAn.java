package vn.edu.taipp.projectfinalexam.model_dto;

public class PhanCongDoAn implements Identifiable {
  private int MaPhanCong;
  private String NgayPhanCong;
  private String GhiChu;
  private DoAn do_an;
  private SinhVien sinh_vien;
  private GiangVien giang_vien;

  // Constructor không tham số
  public PhanCongDoAn() {
  }

  // Constructor đầy đủ tham số
  public PhanCongDoAn(int maPhanCong, String ngayPhanCong, String ghiChu, DoAn do_an, SinhVien sinh_vien, GiangVien giang_vien) {
    this.MaPhanCong = maPhanCong;
    this.NgayPhanCong = ngayPhanCong;
    this.GhiChu = ghiChu;
    this.do_an = do_an;
    this.sinh_vien = sinh_vien;
    this.giang_vien = giang_vien;
  }

  // Getter và Setter
  public int getMaPhanCong() {
    return MaPhanCong;
  }

  public void setMaPhanCong(int maPhanCong) {
    this.MaPhanCong = maPhanCong;
  }

  public String getNgayPhanCong() {
    return NgayPhanCong;
  }

  public void setNgayPhanCong(String ngayPhanCong) {
    this.NgayPhanCong = ngayPhanCong;
  }

  public String getGhiChu() {
    return GhiChu;
  }

  public void setGhiChu(String ghiChu) {
    this.GhiChu = ghiChu;
  }

  public DoAn getDo_an() {
    return do_an;
  }

  public void setDo_an(DoAn do_an) {
    this.do_an = do_an;
  }

  public SinhVien getSinh_vien() {
    return sinh_vien;
  }

  public void setSinh_vien(SinhVien sinh_vien) {
    this.sinh_vien = sinh_vien;
  }

  public GiangVien getGiang_vien() {
    return giang_vien;
  }

  public void setGiang_vien(GiangVien giang_vien) {
    this.giang_vien = giang_vien;
  }

  @Override
  public int getId() {
    return this.MaPhanCong;
  }

  @Override
  public String toString() {
    return "PhanCongDoAn{" +
            "MaPhanCong=" + MaPhanCong +
            ", NgayPhanCong=" + NgayPhanCong +
            ", GhiChu='" + GhiChu + '\'' +
            ", do_an=" + (do_an != null ? do_an.getTenDoAn() : "null") +
            ", sinh_vien=" + (sinh_vien != null ? sinh_vien.getHoTen() : "null") +
            ", giang_vien=" + (giang_vien != null ? giang_vien.getHoTen() : "null") +
            '}';
  }
}
