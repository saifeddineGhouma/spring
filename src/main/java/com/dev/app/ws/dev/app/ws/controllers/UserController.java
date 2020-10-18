package com.dev.app.ws.dev.app.ws.controllers;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.app.ws.dev.app.ws.requests.UserRequest;
import com.dev.app.ws.dev.app.ws.response.UserResponse;
import com.dev.app.ws.dev.app.ws.service.UserService;
import com.dev.app.ws.dev.app.ws.shared.dto.UserDTO;

/*import ch.qos.logback.core.joran.util.beans.BeanUtil;*/

@RestController
@RequestMapping("/users")  // localhost:8081/users
public class UserController {
	@Autowired

	UserService userService ;
	
	@GetMapping
	public String getUsers()
	{
		return "method update user called";
	}
	@PostMapping
	public UserResponse CreatedUser(@RequestBody UserRequest userRequest)
	{
		
		UserDTO userDto = new UserDTO();
		BeanUtils.copyProperties(userRequest, userDto);
		
		UserDTO createUser = userService.createUser(userDto);
		
		/**/
		
		//user response*/
		UserResponse userResponse = new UserResponse();
		
		BeanUtils.copyProperties(createUser,userResponse);
		return userResponse;
			}
	@PutMapping
	public String UpdateUser()
	{
		return "method update user called";
	}
	@DeleteMapping
	public String DeleteUser()
	{
		return "method delete user called";
	}

}
