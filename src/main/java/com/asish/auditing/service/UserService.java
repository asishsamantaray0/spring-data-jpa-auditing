package com.asish.auditing.service;

import com.asish.auditing.entity.User;
import java.util.List;

/**
 * Service class for user.
 *
 * @author asish.samantaray
 */
public interface UserService {

    List<User> getAllUsers();

    User getUserById(Long id);

    User saveUser(User user);

    User updateUser(User user, Long id);
}
