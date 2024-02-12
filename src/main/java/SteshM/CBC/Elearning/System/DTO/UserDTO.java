package SteshM.CBC.Elearning.System.DTO;

import lombok.Data;

@Data
public class UserDTO {
    private String name;
    private String email;
    private  String password;
    private String DateOfBirth;
    private long userTypeId;
}
