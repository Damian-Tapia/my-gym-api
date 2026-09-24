package my_gym_api.controller;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public List<Routine> getRoutines() {
        return routineRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Routine> getRoutineById(@PathVariable UUID id) {
        return routineRepository.findById(id)
                .map(routine -> ResponseEntity.ok(routine))
                .orElse(ResponseEntity.notFound().build());
    }

}