package vn.edu.taipp.projectfinalexam.model_dto;

public class Pivot {
  private int PermissionID;
  private int RoleID;

  // Constructor không tham số
  public Pivot() {
  }

  // Constructor đầy đủ tham số
  public Pivot(int permissionID, int roleID) {
    this.PermissionID = permissionID;
    this.RoleID = roleID;
  }

  // Getter và Setter
  public int getPermissionID() {
    return PermissionID;
  }

  public void setPermissionID(int permissionID) {
    this.PermissionID = permissionID;
  }

  public int getRoleID() {
    return RoleID;
  }

  public void setRoleID(int roleID) {
    this.RoleID = roleID;
  }

  @Override
  public String toString() {
    return "Pivot{" +
            "PermissionID=" + PermissionID +
            ", RoleID=" + RoleID +
            '}';
  }
}
