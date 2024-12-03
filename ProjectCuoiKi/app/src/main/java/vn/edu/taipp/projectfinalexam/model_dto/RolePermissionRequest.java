package vn.edu.taipp.projectfinalexam.model_dto;

public class RolePermissionRequest {
  private int RoleID;       // Mã vai trò
  private int PermissionID; // Mã quyền

  // Constructor không tham số
  public RolePermissionRequest() {
  }

  // Constructor đầy đủ tham số
  public RolePermissionRequest(int roleID, int permissionID) {
    this.RoleID = roleID;
    this.PermissionID = permissionID;
  }

  // Getter và Setter
  public int getRoleID() {
    return RoleID;
  }

  public void setRoleID(int roleID) {
    this.RoleID = roleID;
  }

  public int getPermissionID() {
    return PermissionID;
  }

  public void setPermissionID(int permissionID) {
    this.PermissionID = permissionID;
  }

  @Override
  public String toString() {
    return "RolePermissionRequest{" +
            "RoleID=" + RoleID +
            ", PermissionID=" + PermissionID +
            '}';
  }
}
