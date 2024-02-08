package SteshM.CBC.Elearning.System.DTO;

import lombok.Data;

@Data
public class UserDTO {
    private String name;
    private String email;
    private  String password;
    private long userTypeId;
}
