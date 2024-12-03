package vn.edu.taipp.projectfinalexam.model_dto;

public class Role {
  private int RoleID;
  private String RoleName;
  private Pivot pivot; // Thông tin về bảng "pivot", liên kết giữa quyền và vai trò

  // Constructor không tham số
  public Role() {
  }

  // Constructor đầy đủ tham số
  public Role(int roleID, String roleName, Pivot pivot) {
    this.RoleID = roleID;
    this.RoleName = roleName;
    this.pivot = pivot;
  }

  // Getter và Setter
  public int getRoleID() {
    return RoleID;
  }

  public void setRoleID(int roleID) {
    this.RoleID = roleID;
  }

  public String getRoleName() {
    return RoleName;
  }

  public void setRoleName(String roleName) {
    this.RoleName = roleName;
  }

  public Pivot getPivot() {
    return pivot;
  }

  public void setPivot(Pivot pivot) {
    this.pivot = pivot;
  }

  @Override
  public String toString() {
    return "Role{" +
            "RoleID=" + RoleID +
            ", RoleName='" + RoleName + '\'' +
            ", pivot=" + pivot +
            '}';
  }
}
