package vn.edu.taipp.projectfinalexam.model_dto;

public class GiangVien implements Identifiable {
  private int MaGiangVien;
  private String HoTen;
  private String Email;
  private String SDT;
  private int CanBoKhoa;
  private int HanMucHD;
  private int SoLuongHuongDan;
  private BoMon bo_mon;

  // Constructor không tham số
  public GiangVien() {
  }

  // Constructor đầy đủ tham số
  public GiangVien(int maGiangVien, String hoTen, String email, String sdt, int canBoKhoa, int hanMucHD, int soLuongHuongDan, BoMon bo_mon) {
    this.MaGiangVien = maGiangVien;
    this.HoTen = hoTen;
    this.Email = email;
    this.SDT = sdt;
    this.CanBoKhoa = canBoKhoa;
    this.HanMucHD = hanMucHD;
    this.SoLuongHuongDan = soLuongHuongDan;
    this.bo_mon = bo_mon;
  }

  // Getter và Setter
  public int getMaGiangVien() {
    return MaGiangVien;
  }

  public void setMaGiangVien(int maGiangVien) {
    this.MaGiangVien = maGiangVien;
  }

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

  public int getCanBoKhoa() {
    return CanBoKhoa;
  }

  public void setCanBoKhoa(int canBoKhoa) {
    this.CanBoKhoa = canBoKhoa;
  }

  public int getHanMucHD() {
    return HanMucHD;
  }

  public void setHanMucHD(int hanMucHD) {
    this.HanMucHD = hanMucHD;
  }

  public int getSoLuongHuongDan() {
    return SoLuongHuongDan;
  }

  public void setSoLuongHuongDan(int soLuongHuongDan) {
    this.SoLuongHuongDan = soLuongHuongDan;
  }

  public BoMon getBoMon() {
    return bo_mon;
  }

  public void setBoMon(BoMon bo_mon) {
    this.bo_mon = bo_mon;
  }

  @Override
  public int getId() {
    return this.MaGiangVien;
  }

  @Override
  public String toString() {
    return "GiangVien{" +
            "MaGiangVien=" + MaGiangVien +
            ", HoTen='" + HoTen + '\'' +
            ", Email='" + Email + '\'' +
            ", SDT='" + SDT + '\'' +
            ", CanBoKhoa=" + CanBoKhoa +
            ", HanMucHD=" + HanMucHD +
            ", SoLuongHuongDan=" + SoLuongHuongDan +
            ", bo_mon=" + bo_mon.getTenBoMon()+
            '}';

  }
}
