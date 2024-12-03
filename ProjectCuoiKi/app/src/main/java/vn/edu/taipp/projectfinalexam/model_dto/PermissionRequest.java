package vn.edu.taipp.projectfinalexam.model_dto;

public class PermissionRequest {
  private String PermissionName; // Tên quyền (bắt buộc, tối đa 255 ký tự)

  // Constructor không tham số
  public PermissionRequest() {
  }

  // Constructor đầy đủ tham số
  public PermissionRequest(String permissionName) {
    this.PermissionName = permissionName;
  }

  // Getter và Setter
  public String getPermissionName() {
    return PermissionName;
  }

  public void setPermissionName(String permissionName) {
    this.PermissionName = permissionName;
  }

  @Override
  public String toString() {
    return "PermissionRequest{" +
            "PermissionName='" + PermissionName + '\'' +
            '}';
  }
}
