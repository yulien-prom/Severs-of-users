package com.User.Severs.Controller;

import com.User.Severs.Service.Implementation.UserServiceImplementation;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Severs")

public class UserController {

    @Autowired
    UserServiceImplementation userPServiceImplementation;

    @GetMapping
   public List<User> getAllUser (){
        return userPServiceImplementation.getAllUser();


    }

    @GetMapping ("/{idUser}")
public Optional<User> getUserById (@PathVariable String idUser) {
 return userPServiceImplementation.getUserById(idUser);
    }
    @PostMapping
    public String SaveUser( User userL){
        return userPServiceImplementation.SaveUser(userL);
    }
}
