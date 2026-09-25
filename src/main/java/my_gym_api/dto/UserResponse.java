package my_gym_api.dto;

import java.time.OffsetDateTime;
import java.util.UUID;

import my_gym_api.entity.User;

public record UserResponse(UUID id, String email, OffsetDateTime createdAt) {

    public static UserResponse from(User user) {
        return new UserResponse(user.getId(), user.getEmail(), user.getCreatedAt());
    }
}