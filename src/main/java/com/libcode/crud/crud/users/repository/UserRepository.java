package com.libcode.crud.crud.users.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.libcode.crud.crud.users.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long>{
    
}
