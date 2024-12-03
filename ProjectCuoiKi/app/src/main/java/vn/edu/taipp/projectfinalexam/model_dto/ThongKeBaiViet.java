package vn.edu.taipp.projectfinalexam.model_dto;

public class ThongKeBaiViet {
  private int MaThongKe;
  private int SoLuotXem;
  private int SoBinhLuan;
  private BaiViet bai_viet; // Bài viết liên quan đến thống kê

  // Constructor không tham số
  public ThongKeBaiViet() {
  }

  // Constructor đầy đủ tham số
  public ThongKeBaiViet(int maThongKe, int soLuotXem, int soBinhLuan, BaiViet baiViet) {
    this.MaThongKe = maThongKe;
    this.SoLuotXem = soLuotXem;
    this.SoBinhLuan = soBinhLuan;
    this.bai_viet = baiViet;
  }

  // Getter và Setter
  public int getMaThongKe() {
    return MaThongKe;
  }

  public void setMaThongKe(int maThongKe) {
    this.MaThongKe = maThongKe;
  }

  public int getSoLuotXem() {
    return SoLuotXem;
  }

  public void setSoLuotXem(int soLuotXem) {
    this.SoLuotXem = soLuotXem;
  }

  public int getSoBinhLuan() {
    return SoBinhLuan;
  }

  public void setSoBinhLuan(int soBinhLuan) {
    this.SoBinhLuan = soBinhLuan;
  }

  public BaiViet getBai_viet() {
    return bai_viet;
  }

  public void setBai_viet(BaiViet bai_viet) {
    this.bai_viet = bai_viet;
  }

  @Override
  public String toString() {
    return "ThongKeBaiViet{" +
            "MaThongKe=" + MaThongKe +
            ", SoLuotXem=" + SoLuotXem +
            ", SoBinhLuan=" + SoBinhLuan +
            ", bai_viet=" + (bai_viet != null ? bai_viet : "Chưa có bài viết") +
            '}';
  }
}
