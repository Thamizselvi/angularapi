package com.sw.OMjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import  com.sw.OMjpa.model.User;

public interface UserRepository extends JpaRepository<User,Integer>{

}
