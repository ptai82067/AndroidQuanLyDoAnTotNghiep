package vn.edu.taipp.projectfinalexam.model_dto;



public class NoiDungThucHien implements Identifiable {
  private int ID;
  private String MoTa;
  private String LinkMauNguon;
  private int TinhTrang;
  private String ThoiGianThucHien; // Định dạng thời gian yyyy-MM-dd HH:mm:ss
  private String FileTaoRa;
  private String GhiChu;
  private SinhVien sinh_vien; // Đối tượng sinh viên bên trong JSON

  // Constructor
  public NoiDungThucHien(int ID, String MoTa, String LinkMauNguon, int TinhTrang,
                         String ThoiGianThucHien, String FileTaoRa, String GhiChu, SinhVien sinh_vien) {
    this.ID = ID;
    this.MoTa = MoTa;
    this.LinkMauNguon = LinkMauNguon;
    this.TinhTrang = TinhTrang;
    this.ThoiGianThucHien = ThoiGianThucHien;
    this.FileTaoRa = FileTaoRa;
    this.GhiChu = GhiChu;
    this.sinh_vien = sinh_vien;
  }

  // Getter và Setter
  public int getID() {
    return ID;
  }

  public void setID(int ID) {
    this.ID = ID;
  }


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

  public SinhVien getSinh_vien() {
    return sinh_vien;
  }

  public void setSinh_vien(SinhVien sinh_vien) {
    this.sinh_vien = sinh_vien;
  }

  @Override
  public String toString() {
    return "NoiDungThucHien{" +
            "ID=" + ID +

            ", MoTa='" + MoTa + '\'' +
            ", LinkMauNguon='" + LinkMauNguon + '\'' +
            ", TinhTrang=" + TinhTrang +
            ", ThoiGianThucHien=" + ThoiGianThucHien +
            ", FileTaoRa='" + FileTaoRa + '\'' +
            ", GhiChu='" + GhiChu + '\'' +
            ", sinh_vien=" + sinh_vien.getHoTen() +
            '}';
  }

  @Override
  public int getId() {
    return this.ID;
  }
}

