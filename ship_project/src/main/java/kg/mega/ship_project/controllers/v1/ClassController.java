package kg.mega.ship_project.controllers.v1;

import kg.mega.ship_project.repositories.ClassRepo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class ClassController {
    private final ClassRepo classRepo;

    public ClassController(ClassRepo classRepo) {
        this.classRepo = classRepo;
    }

    @GetMapping("/class_names")
    public ResponseEntity<Map<String, List<String>>> getClassNamesByBattleResult(@RequestParam("battle_result") String battleResult) {
        List<String> classNames = classRepo.findClassNamesByBattleResult(battleResult);
        Map<String, List<String>> response = Collections.singletonMap("class_names", classNames);
        return ResponseEntity.ok(response);
    }
}
