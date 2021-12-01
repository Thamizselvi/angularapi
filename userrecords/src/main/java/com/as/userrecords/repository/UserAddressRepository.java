package com.as.userrecords.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.as.userrecords.model.UserAddress;

public interface UserAddressRepository extends JpaRepository<UserAddress,Integer> {

}
