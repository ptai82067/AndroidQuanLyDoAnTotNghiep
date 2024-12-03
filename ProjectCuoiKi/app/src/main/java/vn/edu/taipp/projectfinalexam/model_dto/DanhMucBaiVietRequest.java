package vn.edu.taipp.projectfinalexam.model_dto;

public class DanhMucBaiVietRequest {
  private String TenDanhMuc; // Bắt buộc, tối đa 191 ký tự

  // Constructor không tham số
  public DanhMucBaiVietRequest() {
  }

  // Constructor đầy đủ tham số
  public DanhMucBaiVietRequest(String tenDanhMuc) {
    this.TenDanhMuc = tenDanhMuc;
  }

  // Getter và Setter
  public String getTenDanhMuc() {
    return TenDanhMuc;
  }

  public void setTenDanhMuc(String tenDanhMuc) {
    this.TenDanhMuc = tenDanhMuc;
  }

  @Override
  public String toString() {
    return "DanhMucBaiVietRequest{" +
            "TenDanhMuc='" + TenDanhMuc + '\'' +
            '}';
  }
}
