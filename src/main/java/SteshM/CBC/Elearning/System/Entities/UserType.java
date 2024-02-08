package SteshM.CBC.Elearning.System.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "userType")
public class UserType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userTypeId;
    private String userTypeName;
}
