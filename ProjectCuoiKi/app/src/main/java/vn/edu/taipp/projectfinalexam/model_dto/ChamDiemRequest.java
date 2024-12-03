package vn.edu.taipp.projectfinalexam.model_dto;

public class ChamDiemRequest {
  private Integer MaDoAn;  // Đảm bảo mã đồ án phải tồn tại trong bảng DoAn
  private Integer MaGiangVien;  // Đảm bảo mã giảng viên phải tồn tại trong bảng GiangVien
  private double Diem;  // Điểm phải là số và trong khoảng từ 0 đến 10
  private String NhanXet;  // Nhận xét có thể rỗng, tối đa 191 ký tự
  private String NgayChamDiem;  // Sử dụng kiểu String cho ngày tháng

  // Constructor không tham số
  public ChamDiemRequest() {
  }

  // Constructor đầy đủ tham số
  public ChamDiemRequest(Integer maDoAn, Integer maGiangVien, double diem, String nhanXet, String ngayChamDiem) {
    this.MaDoAn = maDoAn;
    this.MaGiangVien = maGiangVien;
    this.Diem = diem;
    this.NhanXet = nhanXet;
    this.NgayChamDiem = ngayChamDiem;
  }

  // Getter và Setter
  public Integer getMaDoAn() {
    return MaDoAn;
  }

  public void setMaDoAn(Integer maDoAn) {
    this.MaDoAn = maDoAn;
  }

  public Integer getMaGiangVien() {
    return MaGiangVien;
  }

  public void setMaGiangVien(Integer maGiangVien) {
    this.MaGiangVien = maGiangVien;
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

  @Override
  public String toString() {
    return "ChamDiemRequest{" +
            "MaDoAn=" + MaDoAn +
            ", MaGiangVien=" + MaGiangVien +
            ", Diem=" + Diem +
            ", NhanXet='" + NhanXet + '\'' +
            ", NgayChamDiem='" + NgayChamDiem + '\'' +
            '}';
  }
}
