package com.midterm.exam.repository;

import com.midterm.exam.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    public User getByEmailAndPassword(String email, String password);

    public User findByEmail(String email);
}
