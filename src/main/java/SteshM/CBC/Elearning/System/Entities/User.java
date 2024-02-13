package SteshM.CBC.Elearning.System.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long userId;
    private String name;
    @Column(unique = true)
    private String email;
    @Column(nullable = false)
    private String password;
    private String dateOfBirth;
}
