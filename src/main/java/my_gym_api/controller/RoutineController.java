package my_gym_api.controller;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import my_gym_api.dto.RoutineResponse;
import my_gym_api.entity.Routine;
import my_gym_api.repository.RoutineRepository;

@RestController
@RequestMapping("/api/routines")
public class RoutineController {

    private final RoutineRepository routineRepository;

    public RoutineController(RoutineRepository routineRepository) {
        this.routineRepository = routineRepository;
    }

    @GetMapping()
    public List<RoutineResponse> getRoutines() {
        return routineRepository.findAll().stream().map(RoutineResponse::from).toList();
    }

    @GetMapping("/{id}")
    public ResponseEntity<RoutineResponse> getRoutineById(@PathVariable UUID id) {
        Optional<Routine> found = routineRepository.findById(id);

        if (found.isPresent()) {
            RoutineResponse response = RoutineResponse.from(found.get());
            return ResponseEntity.ok(response);
        }
        return ResponseEntity.notFound().build();
    }

}