package vn.edu.taipp.projectfinalexam.model_dto;

import java.util.Date;

public class DoAnRequest {
  private String TenDoAn;
  private String MoTa;
  private int DoKho;
  private int MaNguoiTao;
  private Integer MaNguoiDuyet;
  private Integer MaNguoiKhoaDoAn;
  private String NgayTao;
  private String NgayDuyet;
  private Integer HanMucDK;
  private Integer SoLuongDK;

  // Constructor không tham số
  public DoAnRequest() {
  }

  // Constructor đầy đủ tham số
  public DoAnRequest(String tenDoAn, String moTa, int doKho, int maNguoiTao, Integer maNguoiDuyet, Integer maNguoiKhoaDoAn,
                     String ngayTao, String ngayDuyet, Integer hanMucDK, Integer soLuongDK) {
    this.TenDoAn = tenDoAn;
    this.MoTa = moTa;
    this.DoKho = doKho;
    this.MaNguoiTao = maNguoiTao;
    this.MaNguoiDuyet = maNguoiDuyet;
    this.MaNguoiKhoaDoAn = maNguoiKhoaDoAn;
    this.NgayTao = ngayTao;
    this.NgayDuyet = ngayDuyet;
    this.HanMucDK = hanMucDK;
    this.SoLuongDK = soLuongDK;
  }

  // Getter và Setter
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

  public int getMaNguoiTao() {
    return MaNguoiTao;
  }

  public void setMaNguoiTao(int maNguoiTao) {
    this.MaNguoiTao = maNguoiTao;
  }

  public Integer getMaNguoiDuyet() {
    return MaNguoiDuyet;
  }

  public void setMaNguoiDuyet(Integer maNguoiDuyet) {
    this.MaNguoiDuyet = maNguoiDuyet;
  }

  public Integer getMaNguoiKhoaDoAn() {
    return MaNguoiKhoaDoAn;
  }

  public void setMaNguoiKhoaDoAn(Integer maNguoiKhoaDoAn) {
    this.MaNguoiKhoaDoAn = maNguoiKhoaDoAn;
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

  public Integer getHanMucDK() {
    return HanMucDK;
  }

  public void setHanMucDK(Integer hanMucDK) {
    this.HanMucDK = hanMucDK;
  }

  public Integer getSoLuongDK() {
    return SoLuongDK;
  }

  public void setSoLuongDK(Integer soLuongDK) {
    this.SoLuongDK = soLuongDK;
  }

  @Override
  public String toString() {
    return "DoAnRequest{" +
            "TenDoAn='" + TenDoAn + '\'' +
            ", MoTa='" + MoTa + '\'' +
            ", DoKho=" + DoKho +
            ", MaNguoiTao=" + MaNguoiTao +
            ", MaNguoiDuyet=" + MaNguoiDuyet +
            ", MaNguoiKhoaDoAn=" + MaNguoiKhoaDoAn +
            ", NgayTao='" + NgayTao + '\'' +
            ", NgayDuyet='" + NgayDuyet + '\'' +
            ", HanMucDK=" + HanMucDK +
            ", SoLuongDK=" + SoLuongDK +
            '}';
  }
}
