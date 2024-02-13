package SteshM.CBC.Elearning.System.Services;

import SteshM.CBC.Elearning.System.DTO.ResponseDTO;
import SteshM.CBC.Elearning.System.DTO.UserDTO;
import SteshM.CBC.Elearning.System.Entities.Profile;
import SteshM.CBC.Elearning.System.Entities.User;
import SteshM.CBC.Elearning.System.Entities.UserType;
import SteshM.CBC.Elearning.System.Repos.UserRepo;
import SteshM.CBC.Elearning.System.utilities.Utilities;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserServices {
    @Autowired
     UserRepo userRepo;
    public ResponseDTO register(UserDTO userDTO) {
        User user = new User();
        user.setName(userDTO.getName());
        user.setEmail(userDTO.getEmail());
        user.setPassword(userDTO.getPassword());
        user.setDateOfBirth(userDTO.getDateOfBirth());

        User createdUser = userRepo.save(user);


        return Utilities.createSuccessfulResponse("Successfully created a user" , createdUser);
}
}
