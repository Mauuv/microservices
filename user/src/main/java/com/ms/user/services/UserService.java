package com.ms.user.services;

import com.ms.user.models.UserModel;
import com.ms.user.producer.UserProducer;
import com.ms.user.repositories.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserProducer userProducer;

     @Transactional
     public UserModel save(UserModel userModel) {
        userRepository.save(userModel);
        userProducer.publishMessageEmail(userModel);
        return userModel;
     }

     public List<UserModel> findAll() {
         return userRepository.findAll();
     }
}
