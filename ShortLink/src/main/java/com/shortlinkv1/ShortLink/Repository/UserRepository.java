package com.shortlinkv1.ShortLink.Repository;

import com.shortlinkv1.ShortLink.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
