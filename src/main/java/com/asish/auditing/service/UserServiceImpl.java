package com.asish.auditing.service;

import com.asish.auditing.entity.User;
import com.asish.auditing.repository.UserRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Implementation class of UserService.
 *
 * @author asish.samantaray
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.findById(id).orElseThrow();
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User updateUser(User user, Long id) {
        User currentUser = userRepository.findById(id).orElseThrow();
        currentUser.setName(user.getName());
        currentUser.setEmail(user.getEmail());
        userRepository.save(currentUser);
        return currentUser;
    }
}
