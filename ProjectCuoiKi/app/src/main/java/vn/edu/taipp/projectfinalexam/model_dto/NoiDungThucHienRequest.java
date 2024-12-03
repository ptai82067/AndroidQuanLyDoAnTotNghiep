package vn.edu.taipp.projectfinalexam.model_dto;


public class NoiDungThucHienRequest {
  private String MoTa;
  private String LinkMauNguon;
  private int TinhTrang; // 1: Đang thực hiện, 0: Chưa thực hiện, -1: Đã hoàn thành
  private String ThoiGianThucHien; // ISO-8601 datetime format
  private String FileTaoRa;
  private String GhiChu;
  private int SinhVienID; // Liên kết tới sinh viên

  // Constructor không tham số
  public NoiDungThucHienRequest() {}

  // Constructor đầy đủ
  public NoiDungThucHienRequest(String moTa, String linkMauNguon, int tinhTrang, String thoiGianThucHien,
                                String fileTaoRa, String ghiChu, int sinhVienID) {
    MoTa = moTa;
    LinkMauNguon = linkMauNguon;
    TinhTrang = tinhTrang;
    ThoiGianThucHien = thoiGianThucHien;
    FileTaoRa = fileTaoRa;
    GhiChu = ghiChu;
    SinhVienID = sinhVienID;
  }

  // Getter và Setter
  public String getMoTa() {
    return MoTa;
  }

  public void setMoTa(String moTa) {
    MoTa = moTa;
  }

  public String getLinkMauNguon() {
    return LinkMauNguon;
  }

  public void setLinkMauNguon(String linkMauNguon) {
    LinkMauNguon = linkMauNguon;
  }

  public int getTinhTrang() {
    return TinhTrang;
  }

  public void setTinhTrang(int tinhTrang) {
    TinhTrang = tinhTrang;
  }

  public String getThoiGianThucHien() {
    return ThoiGianThucHien;
  }

  public void setThoiGianThucHien(String thoiGianThucHien) {
    ThoiGianThucHien = thoiGianThucHien;
  }

  public String getFileTaoRa() {
    return FileTaoRa;
  }

  public void setFileTaoRa(String fileTaoRa) {
    FileTaoRa = fileTaoRa;
  }

  public String getGhiChu() {
    return GhiChu;
  }

  public void setGhiChu(String ghiChu) {
    GhiChu = ghiChu;
  }

  public int getSinhVienID() {
    return SinhVienID;
  }

  public void setSinhVienID(int sinhVienID) {
    SinhVienID = sinhVienID;
  }

  @Override
  public String toString() {
    return "NoiDungThucHienRequest{" +
            "MoTa='" + MoTa + '\'' +
            ", LinkMauNguon='" + LinkMauNguon + '\'' +
            ", TinhTrang=" + TinhTrang +
            ", ThoiGianThucHien=" + ThoiGianThucHien +
            ", FileTaoRa='" + FileTaoRa + '\'' +
            ", GhiChu='" + GhiChu + '\'' +
            ", SinhVienID=" + SinhVienID +
            '}';
  }
}
