package vn.edu.taipp.projectfinalexam.model_dto;

import java.util.List;

public class DoAn implements Identifiable {
  private int MaDoAn;
  private String TenDoAn;
  private String MoTa;
  private int DoKho;
  private String NgayTao;
  private String NgayDuyet;
  private int HanMucDK;
  private int SoLuongDK;
  private List<TaiLieu> tai_lieu;
  private GiangVien giang_vien_tao;
  private GiangVien giang_vien_duyet;
  private GiangVien giang_vien_khoa_do_an;

  // Constructor không tham số
  public DoAn() {
  }

  // Constructor đầy đủ tham số
  public DoAn(int maDoAn, String tenDoAn, String moTa, int doKho, String ngayTao, String ngayDuyet,
              int hanMucDK, int soLuongDK, List<TaiLieu> tai_lieu, GiangVien giang_vien_tao, GiangVien giang_vien_duyet, GiangVien giang_vien_khoa_do_an) {
    this.MaDoAn = maDoAn;
    this.TenDoAn = tenDoAn;
    this.MoTa = moTa;
    this.DoKho = doKho;
    this.NgayTao = ngayTao;
    this.NgayDuyet = ngayDuyet;
    this.HanMucDK = hanMucDK;
    this.SoLuongDK = soLuongDK;
    this.tai_lieu = tai_lieu;
    this.giang_vien_tao = giang_vien_tao;
    this.giang_vien_duyet = giang_vien_duyet;
    this.giang_vien_khoa_do_an = giang_vien_khoa_do_an;
  }

  // Getter và Setter
  public int getMaDoAn() {
    return MaDoAn;
  }

  public void setMaDoAn(int maDoAn) {
    this.MaDoAn = maDoAn;
  }

  public String getTenDoAn() {
    return TenDoAn;
  }

  public void setTenDoAn(String tenDoAn) {
    this.TenDoAn = tenDoAn;
  }

  public String getMoTa() {
    return MoTa;
  }

  public void setMoTa(String moTa) {
    this.MoTa = moTa;
  }

  public int getDoKho() {
    return DoKho;
  }

  public void setDoKho(int doKho) {
    this.DoKho = doKho;
  }

  public String getNgayTao() {
    return NgayTao;
  }

  public void setNgayTao(String ngayTao) {
    this.NgayTao = ngayTao;
  }

  public String getNgayDuyet() {
    return NgayDuyet;
  }

  public void setNgayDuyet(String ngayDuyet) {
    this.NgayDuyet = ngayDuyet;
  }

  public int getHanMucDK() {
    return HanMucDK;
  }

  public void setHanMucDK(int hanMucDK) {
    this.HanMucDK = hanMucDK;
  }

  public int getSoLuongDK() {
    return SoLuongDK;
  }

  public void setSoLuongDK(int soLuongDK) {
    this.SoLuongDK = soLuongDK;
  }

  public List<TaiLieu> getTai_lieu() {
    return tai_lieu;
  }

  public void setTai_lieu(List<TaiLieu> tai_lieu) {
    this.tai_lieu = tai_lieu;
  }

  public GiangVien getGiang_vien_tao() {
    return giang_vien_tao;
  }

  public void setGiang_vien_tao(GiangVien giang_vien_tao) {
    this.giang_vien_tao = giang_vien_tao;
  }

  public GiangVien getGiang_vien_duyet() {
    return giang_vien_duyet;
  }

  public void setGiang_vien_duyet(GiangVien giang_vien_duyet) {
    this.giang_vien_duyet = giang_vien_duyet;
  }

  public GiangVien getGiang_vien_khoa_do_an() {
    return giang_vien_khoa_do_an;
  }

  public void setGiang_vien_khoa_do_an(GiangVien giang_vien_khoa_do_an) {
    this.giang_vien_khoa_do_an = giang_vien_khoa_do_an;
  }

  @Override
  public int getId() {
    return this.MaDoAn;
  }

  @Override
  public String toString() {
    String taiLieu ="\n";
//    for (var i: tai_lieu){
//      taiLieu+=i.getTenTaiLieu();
//    }
    return "DoAn{" +
            "MaDoAn=" + MaDoAn +
            ", TenDoAn='" + TenDoAn + '\'' +
            ", MoTa='" + MoTa + '\'' +
            ", DoKho=" + DoKho +
            ", NgayTao='" + NgayTao + '\'' +
            ", NgayDuyet='" + NgayDuyet + '\'' +
            ", HanMucDK=" + HanMucDK +
            ", SoLuongDK=" + SoLuongDK +", tai_lieu=" + tai_lieu +
            ", giang_vien_tao=" + giang_vien_tao.getHoTen() +
            ", giang_vien_duyet=" + giang_vien_duyet.getHoTen() +
            ", giang_vien_khoa_do_an=" + giang_vien_khoa_do_an.getHoTen() +
            ",TaiLieu"+taiLieu+
            '}';
  }
}
