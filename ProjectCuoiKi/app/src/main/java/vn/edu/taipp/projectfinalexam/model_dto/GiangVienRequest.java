package vn.edu.taipp.projectfinalexam.model_dto;

public class GiangVienRequest {
  private String HoTen;
  private String Email;
  private String SDT;
  private Integer MaBoMon;
  private Boolean CanBoKhoa;
  private Integer HanMucHD;
  private Integer SoLuongHuongDan;

  // Constructor không tham số
  public GiangVienRequest() {
  }

  // Constructor đầy đủ tham số
  public GiangVienRequest(String hoTen, String email, String sdt, Integer maBoMon, Boolean canBoKhoa, Integer hanMucHD, Integer soLuongHuongDan) {
    this.HoTen = hoTen;
    this.Email = email;
    this.SDT = sdt;
    this.MaBoMon = maBoMon;
    this.CanBoKhoa = canBoKhoa;
    this.HanMucHD = hanMucHD;
    this.SoLuongHuongDan = soLuongHuongDan;
  }

  // Getter và Setter
  public String getHoTen() {
    return HoTen;
  }

  public void setHoTen(String hoTen) {
    this.HoTen = hoTen;
  }

  public String getEmail() {
    return Email;
  }

  public void setEmail(String email) {
    this.Email = email;
  }

  public String getSDT() {
    return SDT;
  }

  public void setSDT(String sdt) {
    this.SDT = sdt;
  }

  public Integer getMaBoMon() {
    return MaBoMon;
  }

  public void setMaBoMon(Integer maBoMon) {
    this.MaBoMon = maBoMon;
  }

  public Boolean getCanBoKhoa() {
    return CanBoKhoa;
  }

  public void setCanBoKhoa(Boolean canBoKhoa) {
    this.CanBoKhoa = canBoKhoa;
  }

  public Integer getHanMucHD() {
    return HanMucHD;
  }

  public void setHanMucHD(Integer hanMucHD) {
    this.HanMucHD = hanMucHD;
  }

  public Integer getSoLuongHuongDan() {
    return SoLuongHuongDan;
  }

  public void setSoLuongHuongDan(Integer soLuongHuongDan) {
    this.SoLuongHuongDan = soLuongHuongDan;
  }

  @Override
  public String toString() {
    return "GiangVienRequest{" +
            "HoTen='" + HoTen + '\'' +
            ", Email='" + Email + '\'' +
            ", SDT='" + SDT + '\'' +
            ", MaBoMon=" + MaBoMon +
            ", CanBoKhoa=" + CanBoKhoa +
            ", HanMucHD=" + HanMucHD +
            ", SoLuongHuongDan=" + SoLuongHuongDan +
            '}';
  }
}
