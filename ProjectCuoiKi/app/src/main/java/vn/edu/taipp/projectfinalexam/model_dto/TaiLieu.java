package vn.edu.taipp.projectfinalexam.model_dto;

public class TaiLieu implements Identifiable {
  private int MaTaiLieu;
  private String TenTaiLieu;
  private String LinkTaiLieu;
  private DoAn do_an;

  // Constructor không tham số
  public TaiLieu() {
  }

  // Constructor đầy đủ tham số
  public TaiLieu(int maTaiLieu, String tenTaiLieu, String linkTaiLieu, DoAn do_an) {
    this.MaTaiLieu = maTaiLieu;
    this.TenTaiLieu = tenTaiLieu;
    this.LinkTaiLieu = linkTaiLieu;
    this.do_an = do_an;
  }

  // Getter và Setter
  public int getMaTaiLieu() {
    return MaTaiLieu;
  }

  public void setMaTaiLieu(int maTaiLieu) {
    this.MaTaiLieu = maTaiLieu;
  }

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


  public DoAn getDo_an() {
    return do_an;
  }

  public void setDo_an(DoAn do_an) {
    this.do_an = do_an;
  }

  @Override
  public int getId() {
    return this.MaTaiLieu;
  }

  @Override
  public String toString() {
    return "TaiLieu{" +
            "MaTaiLieu=" + MaTaiLieu +
            ", TenTaiLieu='" + TenTaiLieu + '\'' +
            ", LinkTaiLieu='" + LinkTaiLieu + '\'' +
            ", do_an=" + (do_an != null ? do_an.getTenDoAn() : "null") +
            '}';
  }
}
