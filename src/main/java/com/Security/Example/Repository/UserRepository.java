package com.Security.Example.Repository;

import com.Security.Example.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Integer> {

    @Query(value="select * from user where username=:username" , nativeQuery = true)
    public User getByUsername(String username);

    public Optional<User> findByUsername(String username);
}
