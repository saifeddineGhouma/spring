package com.dev.app.ws.dev.app.ws.repositores;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dev.app.ws.dev.app.ws.entites.UserEntity;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long> {

}
