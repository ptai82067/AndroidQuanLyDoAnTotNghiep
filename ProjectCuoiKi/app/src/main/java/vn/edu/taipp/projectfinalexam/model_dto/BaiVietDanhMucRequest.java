package vn.edu.taipp.projectfinalexam.model_dto;

public class BaiVietDanhMucRequest {
  private int MaBaiViet;   // Bài viết thuộc danh mục
  private int MaDanhMuc;   // Danh mục bài viết

  // Constructor không tham số
  public BaiVietDanhMucRequest() {
  }

  // Constructor đầy đủ tham số
  public BaiVietDanhMucRequest(int maBaiViet, int maDanhMuc) {
    this.MaBaiViet = maBaiViet;
    this.MaDanhMuc = maDanhMuc;
  }

  // Getter và Setter
  public int getMaBaiViet() {
    return MaBaiViet;
  }

  public void setMaBaiViet(int maBaiViet) {
    this.MaBaiViet = maBaiViet;
  }

  public int getMaDanhMuc() {
    return MaDanhMuc;
  }

  public void setMaDanhMuc(int maDanhMuc) {
    this.MaDanhMuc = maDanhMuc;
  }

  @Override
  public String toString() {
    return "BaiVietDanhMucRequest{" +
            "MaBaiViet=" + MaBaiViet +
            ", MaDanhMuc=" + MaDanhMuc +
            '}';
  }
}
