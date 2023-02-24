package com.patasplumas.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.patasplumas.model.User;

//CrudRepository is an interface from JPA that allows to use persistence methods
@Repository
public interface UserRepository extends CrudRepository<User, Integer>{

}
