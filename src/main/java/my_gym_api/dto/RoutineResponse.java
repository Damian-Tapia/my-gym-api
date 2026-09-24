package my_gym_api.dto;

import java.time.OffsetDateTime;
import java.util.UUID;

import my_gym_api.entity.Routine;

public record RoutineResponse(UUID id, String name, Boolean isActive, OffsetDateTime createdAt) { 
    public static RoutineResponse from(Routine routine) {
        return new RoutineResponse(routine.getId(), routine.getName(), routine.getIsActive(), routine.getCreatedAt());
    }
}