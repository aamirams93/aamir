package com.image.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.image.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>
{

}
