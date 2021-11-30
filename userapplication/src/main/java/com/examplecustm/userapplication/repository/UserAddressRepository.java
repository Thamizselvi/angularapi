package com.examplecustm.userapplication.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.examplecustm.userapplication.model.UserAddress;

public interface UserAddressRepository extends JpaRepository<UserAddress,Integer> {

}
