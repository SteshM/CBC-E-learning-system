package SteshM.CBC.Elearning.System.Repos;

import SteshM.CBC.Elearning.System.Entities.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LessonRepo extends JpaRepository<Lesson, Long> {
}
