package com.User.Severs.Service.Implementation;

import com.User.Severs.Repository.UserRepository;
import com.User.Severs.Service.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImplementation implements UserService {

    @Autowired
    UserRepository userLRepository;

    @Override
    public List<User> getAllUser() {
        return userLRepository.findAll();
    }

    @Override
    public Optional<User> getUserById(String idUser) {
        return userLRepository.findById(idUser);
    }

    @Override
    public String SaveUser(User userL) {
        userLRepository.save(userL);
         return "Users saved on their servers";
    }
}
