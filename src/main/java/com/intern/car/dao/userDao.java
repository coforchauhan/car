package com.intern.car.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.intern.car.model.users;

@Repository
public interface userDao extends JpaRepository<users,Integer>{

    users findByUserName(String name);

    
}
