package vn.edu.taipp.projectfinalexam.model_dto;

import java.util.List;

public class DanhMucBaiViet implements Identifiable {
  private int MaDanhMuc;
  private String TenDanhMuc;
  private List<BaiViet> bai_viet; // Danh sách bài viết thuộc danh mục này

  // Constructor không tham số
  public DanhMucBaiViet() {
  }

  // Constructor đầy đủ tham số
  public DanhMucBaiViet(int maDanhMuc, String tenDanhMuc, List<BaiViet> bai_viet) {
    this.MaDanhMuc = maDanhMuc;
    this.TenDanhMuc = tenDanhMuc;
    this.bai_viet = bai_viet;
  }

  // Getter và Setter
  public int getMaDanhMuc() {
    return MaDanhMuc;
  }

  public void setMaDanhMuc(int maDanhMuc) {
    this.MaDanhMuc = maDanhMuc;
  }

  public String getTenDanhMuc() {
    return TenDanhMuc;
  }

  public void setTenDanhMuc(String tenDanhMuc) {
    this.TenDanhMuc = tenDanhMuc;
  }

  public List<BaiViet> getBai_viet() {
    return bai_viet;
  }

  public void setBai_viet(List<BaiViet> bai_viet) {
    this.bai_viet = bai_viet;
  }

  @Override
  public int getId() {
    return this.MaDanhMuc;
  }

  @Override
  public String toString() {
    return "DanhMucBaiViet{" +
            "MaDanhMuc=" + MaDanhMuc +
            ", TenDanhMuc='" + TenDanhMuc + '\'' +
            ", bai_viet=" + bai_viet +
            '}';
  }
}
