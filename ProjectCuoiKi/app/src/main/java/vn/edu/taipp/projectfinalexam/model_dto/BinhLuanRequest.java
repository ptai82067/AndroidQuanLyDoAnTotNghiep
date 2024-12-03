package vn.edu.taipp.projectfinalexam.model_dto;

import java.util.Date;

public class BinhLuanRequest {
  private int MaBaiViet;  // Mã bài viết
  private String NoiDung;  // Nội dung bình luận
  private int MaNguoiBinhLuan; // Mã người bình luận
  private String NgayBinhLuan; // Ngày bình luận (dưới dạng String để dễ xử lý ngày tháng)

  // Constructor không tham số
  public BinhLuanRequest() {
  }

  public BinhLuanRequest(int maBaiViet, String noiDung, String ngayBinhLuan) {
    MaBaiViet = maBaiViet;
    NgayBinhLuan = ngayBinhLuan;
    NoiDung = noiDung;
  }

  // Constructor đầy đủ tham số
  public BinhLuanRequest(int maBaiViet, String noiDung, int maNguoiBinhLuan, String ngayBinhLuan) {
    this.MaBaiViet = maBaiViet;
    this.NoiDung = noiDung;
    this.MaNguoiBinhLuan = maNguoiBinhLuan;
    this.NgayBinhLuan = ngayBinhLuan;
  }

  // Getter và Setter
  public int getMaBaiViet() {
    return MaBaiViet;
  }

  public void setMaBaiViet(int maBaiViet) {
    this.MaBaiViet = maBaiViet;
  }

  public String getNoiDung() {
    return NoiDung;
  }

  public void setNoiDung(String noiDung) {
    this.NoiDung = noiDung;
  }

  public int getMaNguoiBinhLuan() {
    return MaNguoiBinhLuan;
  }

  public void setMaNguoiBinhLuan(int maNguoiBinhLuan) {
    this.MaNguoiBinhLuan = maNguoiBinhLuan;
  }

  public String getNgayBinhLuan() {
    return NgayBinhLuan;
  }

  public void setNgayBinhLuan(String ngayBinhLuan) {
    this.NgayBinhLuan = ngayBinhLuan;
  }

  @Override
  public String toString() {
    return "BinhLuanRequest{" +
            "MaBaiViet=" + MaBaiViet +
            ", NoiDung='" + NoiDung + '\'' +
            ", MaNguoiBinhLuan=" + MaNguoiBinhLuan +
            ", NgayBinhLuan='" + NgayBinhLuan + '\'' +
            '}';
  }
}
