package iunsuccessful.demo.shiro.entity;

public class Role {
    private Long id;

    private String role;

    private String description;

    private String resourceIds;

    private Short available;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role == null ? null : role.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getResourceIds() {
        return resourceIds;
    }

    public void setResourceIds(String resourceIds) {
        this.resourceIds = resourceIds == null ? null : resourceIds.trim();
    }

    public Short getAvailable() {
        return available;
    }

    public void setAvailable(Short available) {
        this.available = available;
    }
}