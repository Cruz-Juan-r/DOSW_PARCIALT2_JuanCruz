package edu.dosw.parcial.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "roles")
public class RoleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private Long roleId;

    @NotBlank
    @Column(name = "name", nullable = false, unique = true, length = 30)
    private String name;

    @ManyToMany(mappedBy = "roles")
    private Set<CollaboratorEntity> collaborators = new HashSet<>();

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "role_permissions",
            joinColumns = @JoinColumn(name = "role_id"),
            inverseJoinColumns = @JoinColumn(name = "permission_id")
    )
    private Set<PermissionEntity> permissions = new HashSet<>();

    public RoleEntity() {}

    public RoleEntity(String name) {
        this.name = name;
    }

    public Long getRoleId() { return roleId; }
    public void setRoleId(Long roleId) { this.roleId = roleId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Set<CollaboratorEntity> getCollaborators() { return collaborators; }
    public void setCollaborators(Set<CollaboratorEntity> collaborators) { this.collaborators = collaborators; }

    public Set<PermissionEntity> getPermissions() { return permissions; }
    public void setPermissions(Set<PermissionEntity> permissions) { this.permissions = permissions; }
}
