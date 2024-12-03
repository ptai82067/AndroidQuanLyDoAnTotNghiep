package vn.edu.taipp.projectfinalexam.model_dto;
public class TaiLieuRequest {
  private String TenTaiLieu;
  private String LinkTaiLieu;
  private Integer MaDoAn; // Đảm bảo rằng mã đồ án tồn tại trong bảng DoAn

  public TaiLieuRequest(String tenTaiLieu, String linkTaiLieu, Integer maDoAn) {
    TenTaiLieu = tenTaiLieu;
    LinkTaiLieu = linkTaiLieu;
    MaDoAn = maDoAn;
  }

  // Getter và Setter
  public String getTenTaiLieu() {
    return TenTaiLieu;
  }

  public void setTenTaiLieu(String tenTaiLieu) {
    this.TenTaiLieu = tenTaiLieu;
  }

  public String getLinkTaiLieu() {
    return LinkTaiLieu;
  }

  public void setLinkTaiLieu(String linkTaiLieu) {
    this.LinkTaiLieu = linkTaiLieu;
  }

  public Integer getMaDoAn() {
    return MaDoAn;
  }

  public void setMaDoAn(Integer maDoAn) {
    this.MaDoAn = maDoAn;
  }

  @Override
  public String toString() {
    return "TaiLieuRequest{" +
            "TenTaiLieu='" + TenTaiLieu + '\'' +
            ", LinkTaiLieu='" + LinkTaiLieu + '\'' +
            ", MaDoAn=" + MaDoAn +
            '}';
  }
}
