package vn.edu.taipp.projectfinalexam.model_dto;

public class UserRequest {
  private int MaNguoiDung; // Mã người dùng (bắt buộc, là số nguyên)
  private String Username; // Username (bắt buộc, tối đa 255 ký tự)
  private String PasswordHash; // Mật khẩu đã mã hóa (bắt buộc, tối đa 255 ký tự)
  private int RoleID; // ID vai trò (bắt buộc và phải tồn tại trong bảng Roles)

  // Constructor không tham số
  public UserRequest() {
  }

  // Constructor đầy đủ tham số
  public UserRequest(int maNguoiDung, String username, String passwordHash, int roleID) {
    this.MaNguoiDung = maNguoiDung;
    this.Username = username;
    this.PasswordHash = passwordHash;
    this.RoleID = roleID;
  }

  // Getter và Setter
  public int getMaNguoiDung() {
    return MaNguoiDung;
  }

  public void setMaNguoiDung(int maNguoiDung) {
    this.MaNguoiDung = maNguoiDung;
  }

  public String getUsername() {
    return Username;
  }

  public void setUsername(String username) {
    this.Username = username;
  }

  public String getPasswordHash() {
    return PasswordHash;
  }

  public void setPasswordHash(String passwordHash) {
    this.PasswordHash = passwordHash;
  }

  public int getRoleID() {
    return RoleID;
  }

  public void setRoleID(int roleID) {
    this.RoleID = roleID;
  }

  @Override
  public String toString() {
    return "UsersRequest{" +
            "MaNguoiDung=" + MaNguoiDung +
            ", Username='" + Username + '\'' +
            ", PasswordHash='" + PasswordHash + '\'' +
            ", RoleID=" + RoleID +
            '}';
  }
}
