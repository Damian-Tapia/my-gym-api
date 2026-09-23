package my_gym_api.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import my_gym_api.entity.Routine;

public interface RoutineRepository extends JpaRepository<Routine, UUID> {}