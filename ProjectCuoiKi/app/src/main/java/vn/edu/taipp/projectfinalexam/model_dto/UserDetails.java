package vn.edu.taipp.projectfinalexam.model_dto;

public class UserDetails {
    private int MaGiangVien;
    private String HoTen;
    private String Email;
    private String SDT;
    private int CanBoKhoa;
    private int HanMucHD;
    private int SoLuongHuongDan;

    public int getMaGiangVien() {
        return MaGiangVien;
    }

    public void setMaGiangVien(int maGiangVien) {
        MaGiangVien = maGiangVien;
    }

    public int getCanBoKhoa() {
        return CanBoKhoa;
    }

    public void setCanBoKhoa(int canBoKhoa) {
        CanBoKhoa = canBoKhoa;
    }

    public int getHanMucHD() {
        return HanMucHD;
    }

    public void setHanMucHD(int hanMucHD) {
        HanMucHD = hanMucHD;
    }

    public int getSoLuongHuongDan() {
        return SoLuongHuongDan;
    }

    public void setSoLuongHuongDan(int soLuongHuongDan) {
        SoLuongHuongDan = soLuongHuongDan;
    }

    // Constructor, Getters và Setters
    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        this.HoTen = hoTen;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        this.Email = email;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }
}
