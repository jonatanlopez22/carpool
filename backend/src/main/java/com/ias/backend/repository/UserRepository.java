package com.ias.backend.repository;

import com.ias.backend.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

    /*
     User findByUsernameAndPassword(String username, String password);
    */
    
    User findByUsernameAndPasswordAndRol(String username, String password, int rol);

    Iterable<User>  findByRol(int rol);

    /*  Iterable<User>  findByPhoneAndRol(String phone,String rol); */
}
