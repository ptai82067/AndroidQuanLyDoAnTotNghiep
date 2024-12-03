package vn.edu.taipp.projectfinalexam.model_dto;




public class PhanCongDoAnRequest {

 
  private Integer MaDoAn;

  
  private Integer MaSinhVien;

 
  private Integer MaGiangVien;

  
  private String NgayPhanCong;

  private String GhiChu;

  // Constructor
  public PhanCongDoAnRequest(Integer maDoAn, Integer maSinhVien, Integer maGiangVien, String ngayPhanCong, String ghiChu) {
    MaDoAn = maDoAn;
    MaSinhVien = maSinhVien;
    MaGiangVien = maGiangVien;
    NgayPhanCong = ngayPhanCong;
    GhiChu = ghiChu;
  }

  // Getter và Setter
  public Integer getMaDoAn() {
    return MaDoAn;
  }

  public void setMaDoAn(Integer maDoAn) {
    MaDoAn = maDoAn;
  }

  public Integer getMaSinhVien() {
    return MaSinhVien;
  }

  public void setMaSinhVien(Integer maSinhVien) {
    MaSinhVien = maSinhVien;
  }

  public Integer getMaGiangVien() {
    return MaGiangVien;
  }

  public void setMaGiangVien(Integer maGiangVien) {
    MaGiangVien = maGiangVien;
  }

  public String getNgayPhanCong() {
    return NgayPhanCong;
  }

  public void setNgayPhanCong(String ngayPhanCong) {
    NgayPhanCong = ngayPhanCong;
  }

  public String getGhiChu() {
    return GhiChu;
  }

  public void setGhiChu(String ghiChu) {
    GhiChu = ghiChu;
  }

  @Override
  public String toString() {
    return "PhanCongDoAnRequest{" +
            "MaDoAn=" + MaDoAn +
            ", MaSinhVien=" + MaSinhVien +
            ", MaGiangVien=" + MaGiangVien +
            ", NgayPhanCong=" + NgayPhanCong +
            ", GhiChu='" + GhiChu + '\'' +
            '}';
  }
}
