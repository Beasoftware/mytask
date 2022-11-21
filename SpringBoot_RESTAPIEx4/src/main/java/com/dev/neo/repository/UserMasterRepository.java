package com.dev.neo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.neo.model.UserMaster;

@Repository
public interface UserMasterRepository extends JpaRepository<UserMaster, Integer>{

}
