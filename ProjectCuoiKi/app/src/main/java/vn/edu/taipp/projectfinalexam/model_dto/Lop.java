package vn.edu.taipp.projectfinalexam.model_dto;

public class Lop implements Identifiable {
  private int MaLop;
  private String TenLop;
  private Khoa khoa;

  public Lop(String tenLop, Khoa khoa) {
    TenLop = tenLop;
    this.khoa = khoa;
  }


  public int getMaLop() {
    return MaLop;
  }

  public void setMaLop(int maLop) {
    MaLop = maLop;
  }

  public Khoa getKhoa() {
    return khoa;
  }

  public void setKhoa(Khoa khoa) {
    this.khoa = khoa;
  }

  public String getTenLop() {
    return TenLop;
  }

  public void setTenLop(String tenLop) {
    TenLop = tenLop;
  }

  @Override
  public int getId() {
    return this.MaLop;
  }

  @Override
  public String toString() {
    return this.getTenLop();
  }
}
