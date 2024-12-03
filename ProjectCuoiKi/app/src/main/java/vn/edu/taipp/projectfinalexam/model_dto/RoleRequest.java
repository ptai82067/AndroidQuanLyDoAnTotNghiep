package vn.edu.taipp.projectfinalexam.model_dto;

public class RoleRequest {
  private String name; // Tên vai trò (bắt buộc)
  private String description; // Mô tả vai trò (tùy chọn)

  // Constructor không tham số
  public RoleRequest() {
  }

  // Constructor đầy đủ tham số
  public RoleRequest(String name, String description) {
    this.name = name;
    this.description = description;
  }

  // Getter và Setter
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public String toString() {
    return "RolesRequest{" +
            "name='" + (name != null ? name : "Chưa có tên vai trò") + '\'' +
            ", description='" + (description != null ? description : "Chưa có mô tả") + '\'' +
            '}';
  }
}
