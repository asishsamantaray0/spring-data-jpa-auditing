package com.asish.auditing.repository;

import com.asish.auditing.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for User Entity.
 *
 * @author asish.samantaray
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
