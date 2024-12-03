package vn.edu.taipp.projectfinalexam.model_dto;

public class BinhLuan implements Identifiable {
  private int MaBinhLuan;  // Mã bình luận
  private String NoiDung;  // Nội dung bình luận
  private String NgayBinhLuan; // Ngày bình luận
  private BaiViet bai_viet; // Bài viết mà bình luận thuộc về
  private GiangVien nguoi_binh_luan; // Người bình luận

  // Constructor không tham số
  public BinhLuan() {
  }

  // Constructor đầy đủ tham số
  public BinhLuan(int maBinhLuan, String noiDung, String ngayBinhLuan, BaiViet baiViet, GiangVien nguoiBinhLuan) {
    this.MaBinhLuan = maBinhLuan;
    this.NoiDung = noiDung;
    this.NgayBinhLuan = ngayBinhLuan;
    this.bai_viet = baiViet;
    this.nguoi_binh_luan = nguoiBinhLuan;
  }

  // Getter và Setter
  public int getMaBinhLuan() {
    return MaBinhLuan;
  }

  public void setMaBinhLuan(int maBinhLuan) {
    this.MaBinhLuan = maBinhLuan;
  }

  public String getNoiDung() {
    return NoiDung;
  }

  public void setNoiDung(String noiDung) {
    this.NoiDung = noiDung;
  }

  public String getNgayBinhLuan() {
    return NgayBinhLuan;
  }

  public void setNgayBinhLuan(String ngayBinhLuan) {
    this.NgayBinhLuan = ngayBinhLuan;
  }

  public BaiViet getBaiViet() {
    return bai_viet;
  }

  public void setBaiViet(BaiViet baiViet) {
    this.bai_viet = baiViet;
  }

  public GiangVien getNguoiBinhLuan() {
    return nguoi_binh_luan;
  }

  public void setNguoiBinhLuan(GiangVien nguoiBinhLuan) {
    this.nguoi_binh_luan = nguoiBinhLuan;
  }

  @Override
  public int getId() {
    return this.MaBinhLuan;
  }

  @Override
  public String toString() {
    return "BinhLuan{" +
            "MaBinhLuan=" + MaBinhLuan +
            ", NoiDung='" + NoiDung + '\'' +
            ", NgayBinhLuan='" + NgayBinhLuan + '\'' +
            ", bai_viet=" + (bai_viet != null ? bai_viet.getTieuDe() : "null") +
            ", nguoi_binh_luan=" + (nguoi_binh_luan != null ? nguoi_binh_luan.getHoTen() : "null") +
            '}';
  }
}
