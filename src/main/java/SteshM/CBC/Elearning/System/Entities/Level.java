package SteshM.CBC.Elearning.System.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;

@Entity
@Data
@NoArgsConstructor
@Table (name = "level")
public class Level{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long LevelId;
    private String LevelName;
    private String description;


}
