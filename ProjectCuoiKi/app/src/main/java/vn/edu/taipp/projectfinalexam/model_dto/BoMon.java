package vn.edu.taipp.projectfinalexam.model_dto;

public class BoMon implements Identifiable {
  private int MaBoMon;
  private String TenBoMon;

  // Constructor không tham số
  public BoMon() {
  }

  // Constructor đầy đủ tham số
  public BoMon(int maBoMon, String tenBoMon) {
    this.MaBoMon = maBoMon;
    this.TenBoMon = tenBoMon;
  }

  // Getter và Setter
  public int getMaBoMon() {
    return MaBoMon;
  }

  public void setMaBoMon(int maBoMon) {
    this.MaBoMon = maBoMon;
  }

  public String getTenBoMon() {
    return TenBoMon;
  }

  public void setTenBoMon(String tenBoMon) {
    this.TenBoMon = tenBoMon;
  }

  @Override
  public String toString() {
    return "BoMon{" +
            "MaBoMon=" + MaBoMon +
            ", TenBoMon='" + TenBoMon + '\'' +
            '}';
  }

  @Override
  public int getId() {
    return this.MaBoMon;
  }
}
