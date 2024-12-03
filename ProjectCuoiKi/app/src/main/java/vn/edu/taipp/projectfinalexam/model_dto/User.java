package vn.edu.taipp.projectfinalexam.model_dto;

public class User {
  private int id;
  private int MaNguoiDung;
  private String Username;
  private String PasswordHash;
  private Role role; // Vai trò của người dùng (Sinh Viên, Giảng Viên, v.v.)

  // Constructor không tham số
  public User() {
  }

  // Constructor đầy đủ tham số
  public User(int id, int maNguoiDung, String username, String passwordHash, Role role) {
    this.id = id;
    this.MaNguoiDung = maNguoiDung;
    this.Username = username;
    this.PasswordHash = passwordHash;

    this.role = role;
  }

  // Getter và Setter
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

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


  public Role getRole() {
    return role;
  }

  public void setRole(Role role) {
    this.role = role;
  }

  @Override
  public String toString() {
    return "Users{" +
            "id=" + id +
            ", MaNguoiDung=" + MaNguoiDung +
            ", Username='" + Username + '\'' +
            ", PasswordHash='" + PasswordHash + '\'' +
            ", role=" + (role != null ? role.getRoleName() : "Chưa có vai trò") +
            '}';
  }
}
