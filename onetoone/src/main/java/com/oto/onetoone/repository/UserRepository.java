package com.oto.onetoone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oto.onetoone.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

}
