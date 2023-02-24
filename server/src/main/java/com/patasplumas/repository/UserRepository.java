package com.patasplumas.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.patasplumas.model.User;

//CrudRepository is an interface that contains CRUD operations
//CrudRepository<T, ID> 
//T: Domain type that repository manages(Generally the Entity/Model class name)
//ID: Type of the id of the entity that repository manages
@Repository
public interface UserRepository extends CrudRepository<User, Integer>{

}
