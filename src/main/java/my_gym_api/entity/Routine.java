package my_gym_api.entity;

import java.time.OffsetDateTime;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "routines") 
public class Routine {
    @Id 
    private UUID              id;
    @Column(name="user_id")
    private UUID              userId;

    @Column(nullable=false)
    private String            name;

    @Column(name="is_active")
    private Boolean           isActive;
    
    @Column(name="created_at")
    private OffsetDateTime    createdAt;

    public UUID getId() {
        return id;
    }
    public UUID getUserId() {
        return userId;
    }
    public String getName() {
        return name;
    }
    public Boolean getIsActive() {
        return isActive;
    }
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setId(UUID id) {
        this.id = id;
    }
    public void setUserId(UUID userId) {
        this.userId = userId;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }
    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
