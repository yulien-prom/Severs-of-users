package com.User.Severs.Service;

import org.apache.catalina.User;

import java.util.List;
import java.util.Optional;

public interface UserService{

    List<User> getAllUser();

    Optional<User> getUserById(String idUser);

    String SaveUser(User user);

}



