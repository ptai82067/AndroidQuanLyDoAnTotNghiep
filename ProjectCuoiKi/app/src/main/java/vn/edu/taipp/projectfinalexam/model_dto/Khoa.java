package vn.edu.taipp.projectfinalexam.model_dto;

public class Khoa implements Identifiable {
  private int MaKhoa;
  private String TenKhoa;

  public Khoa(String tenKhoa) {
    TenKhoa = tenKhoa;
  }

  public int getMaKhoa() {
    return MaKhoa;
  }

  public void setMaKhoa(int maKhoa) {
    MaKhoa = maKhoa;
  }

  public String getTenKhoa() {
    return TenKhoa;
  }

  public void setTenKhoa(String tenKhoa) {
    TenKhoa = tenKhoa;
  }

  @Override
  public int getId() {
    return this.MaKhoa;
  }
}
