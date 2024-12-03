package vn.edu.taipp.projectfinalexam.model_dto;

import java.util.List;

public class Permission {
  private int PermissionID;
  private String PermissionName;
  private List<Role> roles; // Liên kết với các Role
  private Object pivot; // Có thể là một danh sách hoặc đối tượng liên kết giữa Permission và Role

  // Getter và Setter
  public int getPermissionID() {
    return PermissionID;
  }

  public void setPermissionID(int permissionID) {
    PermissionID = permissionID;
  }

  public String getPermissionName() {
    return PermissionName;
  }

  public void setPermissionName(String permissionName) {
    PermissionName = permissionName;
  }

  public List<Role> getRoles() {
    return roles;
  }

  public void setRoles(List<Role> roles) {
    this.roles = roles;
  }

  public Object getPivot() {
    return pivot;
  }

  public void setPivot(Object pivot) {
    this.pivot = pivot;
  }

  // Phương thức toString() để hiển thị thông tin Permission
  @Override
  public String toString() {
    StringBuilder rolesInfo = new StringBuilder();
    if (roles != null && !roles.isEmpty()) {
      for (Role role : roles) {
        rolesInfo.append(role.getRoleName()).append(", ");
      }
      rolesInfo.setLength(rolesInfo.length() - 2); // Loại bỏ dấu phẩy cuối
    } else {
      rolesInfo.append("No roles assigned");
    }

    return "Permission{" +
            "PermissionID=" + PermissionID +
            ", PermissionName='" + PermissionName + '\'' +
            ", roles=" + rolesInfo.toString() +
            ", pivot=" + (pivot != null ? pivot.toString() : "null") +
            '}';
  }
}
