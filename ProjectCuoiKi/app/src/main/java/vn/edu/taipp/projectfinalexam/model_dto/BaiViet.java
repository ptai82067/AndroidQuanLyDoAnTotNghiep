package vn.edu.taipp.projectfinalexam.model_dto;

import java.util.List;

public class BaiViet implements Identifiable {
  private int MaBaiViet;
  private String TieuDe;
  private String NoiDung;
  private String NgayTao; // Dùng String cho ngày tháng để giữ nguyên định dạng JSON
  private String TinhTrang;
  private GiangVien giang_vien; // Giảng viên tạo bài viết
  private List<DanhMucBaiViet> danh_muc; // Danh mục bài viết thuộc về

  // Constructor không tham số
  public BaiViet() {
  }

  // Constructor đầy đủ tham số
  public BaiViet(int maBaiViet, String tieuDe, String noiDung, String ngayTao, String tinhTrang, GiangVien giang_vien, List<DanhMucBaiViet> danh_muc) {
    this.MaBaiViet = maBaiViet;
    this.TieuDe = tieuDe;
    this.NoiDung = noiDung;
    this.NgayTao = ngayTao;
    this.TinhTrang = tinhTrang;
    this.giang_vien = giang_vien;
    this.danh_muc = danh_muc;
  }

  // Getter và Setter
  public int getMaBaiViet() {
    return MaBaiViet;
  }

  public void setMaBaiViet(int maBaiViet) {
    this.MaBaiViet = maBaiViet;
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

  public String getTinhTrang() {
    return TinhTrang;
  }

  public void setTinhTrang(String tinhTrang) {
    this.TinhTrang = tinhTrang;
  }

  public GiangVien getGiang_vien() {
    return giang_vien;
  }

  public void setGiang_vien(GiangVien giang_vien) {
    this.giang_vien = giang_vien;
  }

  public List<DanhMucBaiViet> getDanh_muc() {
    return danh_muc;
  }

  public void setDanh_muc(List<DanhMucBaiViet> danh_muc) {
    this.danh_muc = danh_muc;
  }

  @Override
  public int getId() {
    return this.MaBaiViet;
  }

  @Override
  public String toString() {
    return "BaiViet{" +
            "MaBaiViet=" + MaBaiViet +
            ", TieuDe='" + TieuDe + '\'' +
            ", NoiDung='" + NoiDung + '\'' +
            ", NgayTao='" + NgayTao + '\'' +
            ", TinhTrang='" + TinhTrang + '\'' +
            ", giang_vien=" + (giang_vien != null ? giang_vien.getHoTen() : "null") +
            ", danh_muc=" + danh_muc +
            '}';
  }
}
