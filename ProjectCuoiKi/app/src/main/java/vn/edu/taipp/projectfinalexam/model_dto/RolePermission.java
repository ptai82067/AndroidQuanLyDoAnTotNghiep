package vn.edu.taipp.projectfinalexam.model_dto;

import java.util.List;

public class RolePermission {
  private int RolePermissionID;     // Mã RolePermission
  private int RoleID;               // Mã vai trò
  private int PermissionID;         // Mã quyền
  private List<Role> roles;         // Danh sách các vai trò liên quan
  private List<Permission> permissions; // Danh sách các quyền liên quan

  // Constructor không tham số
  public RolePermission() {
  }

  // Constructor đầy đủ tham số
  public RolePermission(int rolePermissionID, int roleID, int permissionID, List<Role> roles, List<Permission> permissions) {
    this.RolePermissionID = rolePermissionID;
    this.RoleID = roleID;
    this.PermissionID = permissionID;
    this.roles = roles;
    this.permissions = permissions;
  }

  // Getter và Setter
  public int getRolePermissionID() {
    return RolePermissionID;
  }

  public void setRolePermissionID(int rolePermissionID) {
    this.RolePermissionID = rolePermissionID;
  }

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

  public List<Role> getRoles() {
    return roles;
  }

  public void setRoles(List<Role> roles) {
    this.roles = roles;
  }

  public List<Permission> getPermissions() {
    return permissions;
  }

  public void setPermissions(List<Permission> permissions) {
    this.permissions = permissions;
  }

  @Override
  public String toString() {
    // Kiểm tra null và xử lý cho danh sách roles
    StringBuilder rolesInfo = new StringBuilder();
    if (roles != null && !roles.isEmpty()) {
      for (Role role : roles) {
        rolesInfo.append(role.getRoleName()).append(", ");
      }
      // Loại bỏ dấu phẩy thừa ở cuối
      rolesInfo.setLength(rolesInfo.length() - 2);
    } else {
      rolesInfo.append("No roles assigned");
    }

    // Kiểm tra null và xử lý cho danh sách permissions
    StringBuilder permissionsInfo = new StringBuilder();
    if (permissions != null && !permissions.isEmpty()) {
      for (Permission permission : permissions) {
        permissionsInfo.append(permission.getPermissionName()).append(", ");
      }
      // Loại bỏ dấu phẩy thừa ở cuối
      permissionsInfo.setLength(permissionsInfo.length() - 2);
    } else {
      permissionsInfo.append("No permissions assigned");
    }

    return "RolePermission{" +
            "RolePermissionID=" + RolePermissionID +
            ", RoleID=" + RoleID +
            ", PermissionID=" + PermissionID +
            ", roles=" + rolesInfo.toString() +
            ", permissions=" + permissionsInfo.toString() +
            '}';
  }

}
