package vn.edu.taipp.projectfinalexam.model_dto;

public class BoMonRequest {
  private String TenBoMon;

  // Constructor không tham số
  public BoMonRequest() {
  }

  // Constructor đầy đủ tham số
  public BoMonRequest(String tenBoMon) {
    this.TenBoMon = tenBoMon;
  }

  // Getter và Setter
  public String getTenBoMon() {
    return TenBoMon;
  }

  public void setTenBoMon(String tenBoMon) {
    this.TenBoMon = tenBoMon;
  }

  @Override
  public String toString() {
    return "BoMonRequest{" +
            "TenBoMon='" + TenBoMon + '\'' +
            '}';
  }
}

