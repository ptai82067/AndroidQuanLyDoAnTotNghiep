package vn.edu.taipp.projectfinalexam.model_dto;

public class LichBaoVe implements Identifiable {
  private int MaLichBaoVe;
  private String ThoiGian; // Dùng String cho ngày tháng để giữ nguyên định dạng JSON
  private String DiaDiem;
  private String MaHoiDong;
  private DoAn do_an; // Dự án có liên quan

  // Constructor không tham số
  public LichBaoVe() {
  }

  // Constructor đầy đủ tham số
  public LichBaoVe(int maLichBaoVe, String thoiGian, String diaDiem, String maHoiDong, DoAn do_an) {
    this.MaLichBaoVe = maLichBaoVe;
    this.ThoiGian = thoiGian;
    this.DiaDiem = diaDiem;
    this.MaHoiDong = maHoiDong;
    this.do_an = do_an;
  }

  // Getter và Setter
  public int getMaLichBaoVe() {
    return MaLichBaoVe;
  }

  public void setMaLichBaoVe(int maLichBaoVe) {
    this.MaLichBaoVe = maLichBaoVe;
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

  public DoAn getDo_an() {
    return do_an;
  }

  public void setDo_an(DoAn do_an) {
    this.do_an = do_an;
  }

  @Override
  public int getId() {
    return this.MaLichBaoVe;
  }

  @Override
  public String toString() {
    return "LichBaoVe{" +
            "MaLichBaoVe=" + MaLichBaoVe +
            ", ThoiGian='" + ThoiGian + '\'' +
            ", DiaDiem='" + DiaDiem + '\'' +
            ", MaHoiDong='" + MaHoiDong + '\'' +
            ", do_an=" + (do_an != null ? do_an.getTenDoAn() : "null") +
            '}';
  }
}
