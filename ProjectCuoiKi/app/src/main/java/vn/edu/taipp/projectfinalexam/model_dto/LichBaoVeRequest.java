package vn.edu.taipp.projectfinalexam.model_dto;

public class LichBaoVeRequest {
  private int MaDoAn;  // Phải tồn tại trong bảng DoAn
  private String ThoiGian;  // Thời gian phải là một ngày hợp lệ
  private String DiaDiem;  // Địa điểm không được để trống, tối đa 191 ký tự
  private String MaHoiDong;  // Mã hội đồng có thể rỗng, tối đa 191 ký tự

  // Constructor không tham số
  public LichBaoVeRequest() {
  }

  // Constructor đầy đủ tham số
  public LichBaoVeRequest(int maDoAn, String thoiGian, String diaDiem, String maHoiDong) {
    this.MaDoAn = maDoAn;
    this.ThoiGian = thoiGian;
    this.DiaDiem = diaDiem;
    this.MaHoiDong = maHoiDong;
  }

  // Getter và Setter
  public int getMaDoAn() {
    return MaDoAn;
  }

  public void setMaDoAn(int maDoAn) {
    this.MaDoAn = maDoAn;
  }

  public String getThoiGian() {
    return ThoiGian;
  }

  public void setThoiGian(String thoiGian) {
    this.ThoiGian = thoiGian;
  }

  public String getDiaDiem() {
    return DiaDiem;
  }

  public void setDiaDiem(String diaDiem) {
    this.DiaDiem = diaDiem;
  }

  public String getMaHoiDong() {
    return MaHoiDong;
  }

  public void setMaHoiDong(String maHoiDong) {
    this.MaHoiDong = maHoiDong;
  }

  @Override
  public String toString() {
    return "LichBaoVeRequest{" +
            "MaDoAn=" + MaDoAn +
            ", ThoiGian='" + ThoiGian + '\'' +
            ", DiaDiem='" + DiaDiem + '\'' +
            ", MaHoiDong='" + MaHoiDong + '\'' +
            '}';
  }
}
