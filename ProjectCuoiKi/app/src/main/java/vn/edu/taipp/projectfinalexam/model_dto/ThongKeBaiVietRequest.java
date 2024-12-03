package vn.edu.taipp.projectfinalexam.model_dto;

public class ThongKeBaiVietRequest {
  private int MaBaiViet; // Bài viết mà thống kê liên quan
  private int SoLuotXem; // Số lượt xem, bắt buộc và phải là số nguyên không âm
  private int SoBinhLuan; // Số bình luận, bắt buộc và phải là số nguyên không âm

  // Constructor không tham số
  public ThongKeBaiVietRequest() {
  }

  // Constructor đầy đủ tham số
  public ThongKeBaiVietRequest(int maBaiViet, int soLuotXem, int soBinhLuan) {
    this.MaBaiViet = maBaiViet;
    this.SoLuotXem = soLuotXem;
    this.SoBinhLuan = soBinhLuan;
  }

  // Getter và Setter
  public int getMaBaiViet() {
    return MaBaiViet;
  }

  public void setMaBaiViet(int maBaiViet) {
    this.MaBaiViet = maBaiViet;
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

  @Override
  public String toString() {
    return "ThongKeBaiVietRequest{" +
            "MaBaiViet=" + MaBaiViet +
            ", SoLuotXem=" + SoLuotXem +
            ", SoBinhLuan=" + SoBinhLuan +
            '}';
  }
}
