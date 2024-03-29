package SteshM.CBC.Elearning.System.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "profile")
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long profileId;
    private String username;
    private String password;
}
