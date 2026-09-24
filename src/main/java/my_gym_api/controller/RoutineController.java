package my_gym_api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import my_gym_api.entity.Routine;
import my_gym_api.repository.RoutineRepository;

@RestController
@RequestMapping("/api")
public class RoutineController {

    private final RoutineRepository routineRepository;

    public RoutineController(RoutineRepository routineRepository) {
        this.routineRepository = routineRepository;
    }

    @GetMapping("/routines")
    public List<Routine> getRoutines() {
        return routineRepository.findAll();
    }

}