package SteshM.CBC.Elearning.System.Repos;

import SteshM.CBC.Elearning.System.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
}
