package com.BikkadIT.Repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.BikkadIT.modul.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

}
