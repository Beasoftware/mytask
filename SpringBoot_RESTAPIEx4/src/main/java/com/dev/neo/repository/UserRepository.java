package com.dev.neo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.dev.neo.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	@Query(value = "SELECT * FROM user_tbl u WHERE " + "LOWER(u.username) LIKE LOWER(CONCAT('%':query,'%') OR"
			+ "LOWER(u.password) LIKE LOWER(CONCAT('%':query,'%'))", nativeQuery = true)
	List<User> searchUsers(String query);

}// end class
