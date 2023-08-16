package com.mehmet.QuestionApp.Controller;

import com.mehmet.QuestionApp.Entity.User;
import com.mehmet.QuestionApp.Repository.UserRepository;
import com.mehmet.QuestionApp.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {

    private UserRepository userRepository;
    public UserController(UserRepository userRepository){
        this.userRepository = userRepository; // springboot un getirdiği bean i repomuza atar
    }
    @Autowired
    private UserService userService;

    @GetMapping
    public List<User>getAllUsers(){
        return userService.getAllUsers();
    }

    @PostMapping
    public User createUser(@RequestBody User newUser){ // RequestBody = requesttin body sindeki bilgileri alıp user objesine mapler
        return userService.saveOnUser(newUser);
    }
    @GetMapping("/{userId}")
    public User seeUserDetails(@PathVariable Long userId ){
        return userService.getUserById(userId);
    }

    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable Long userId){
         userService.deleteById(userId);
    }
    
}
