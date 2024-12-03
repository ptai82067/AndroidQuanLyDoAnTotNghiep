package vn.edu.taipp.projectfinalexam.model_dto;

public class LopRequest {
  private String TenLop;
  private int MaKhoa;

  public LopRequest(String tenLop, int maKhoa) {
    TenLop = tenLop;
    MaKhoa = maKhoa;
  }

  public String getTenLop() {
    return TenLop;
  }

  public void setTenLop(String tenLop) {
    TenLop = tenLop;
  }

  public int getMaKhoa() {
    return MaKhoa;
  }

  public void setMaKhoa(int maKhoa) {
    MaKhoa = maKhoa;
  }
}
