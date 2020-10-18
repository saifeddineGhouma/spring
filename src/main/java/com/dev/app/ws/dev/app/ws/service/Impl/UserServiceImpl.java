package com.dev.app.ws.dev.app.ws.service.Impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.app.ws.dev.app.ws.entites.UserEntity;
import com.dev.app.ws.dev.app.ws.repositores.UserRepository;
import com.dev.app.ws.dev.app.ws.service.UserService;
import com.dev.app.ws.dev.app.ws.shared.dto.UserDTO;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepository userRepository ;
	@Override
	public UserDTO createUser(UserDTO user) {
		// TODO Auto-generated method stub
		UserEntity userEntity = new UserEntity();
		
		//BeanUtils.copyProperties(user, userEntity);
		userEntity.setEncryptedPassword("password test");
		userEntity.setUserID("value user ID");
		/*UserEntity newUser = userRepository.save(userEntity);
		UserDTO userdto = new UserDTO();
		BeanUtils.copyProperties(userdto, newUser);*/
		return null;
	}

}
