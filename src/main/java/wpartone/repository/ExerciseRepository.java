package wpartone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import wpartone.model.entity.Exercise;

public interface ExerciseRepository extends JpaRepository<Exercise,String> {
}
