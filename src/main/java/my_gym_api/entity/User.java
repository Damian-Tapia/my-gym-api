package my_gym_api.entity;

import java.time.OffsetDateTime;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "User")
public class User {
    @Id
    private UUID    id;
    
    @Column(nullable = false)
    private String  email;

    @Column(name = "password_hash")
    private String passwordHash;

    @Column(name="created_at")
    private OffsetDateTime    createdAt;
}
