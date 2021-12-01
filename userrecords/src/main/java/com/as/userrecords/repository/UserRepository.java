package com.as.userrecords.repository;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
	
import com.as.userrecords.model.User;
import com.as.userrecords.model.UserAddress;

@Repository
public interface UserRepository extends CrudRepository<User, Integer>{
//	
//	@Query(value =" select * from userinfo inner join user_address on user.id=user_address.user_id where id=101;", 
//			nativeQuery=true)
//	  List<User> findAll();
//	
//	@Query(value = "SELECT * FROM userinfo u WHERE u.id = 101", 
//			  nativeQuery = true)
//    List<User> findById();
//	
//	@Query(value="SELECT a FROM userinfo a WHERE name = ?102",nativeQuery = true)
//    List<User> findByFirstNameAndLastName(String name);
//
//
	List<User> findByName(String name);
	List<User> findByNameAndEmail(String name, String email);

	UserAddress save(UserAddress userAddress);

}
