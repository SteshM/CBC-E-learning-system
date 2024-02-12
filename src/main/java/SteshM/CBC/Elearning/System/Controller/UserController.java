package SteshM.CBC.Elearning.System.Controller;

import SteshM.CBC.Elearning.System.DTO.ResponseDTO;
import SteshM.CBC.Elearning.System.DTO.UserDTO;
import SteshM.CBC.Elearning.System.Repos.UserRepo;
import SteshM.CBC.Elearning.System.Services.UserServices;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/v1/user")
public class UserController {
    @Autowired
    UserServices userServices;
    @Autowired
    UserRepo userRepo;
    @GetMapping ("/hello")
    public String welcome(){
        return "hello enjoy our services!";
    }
    @PostMapping("/register")
    public ResponseDTO register(@RequestBody UserDTO userDTO){
        log.info("Received a request  to register a user. Payload received:{}",userDTO);
        return userServices.register(userDTO);

    }
}
