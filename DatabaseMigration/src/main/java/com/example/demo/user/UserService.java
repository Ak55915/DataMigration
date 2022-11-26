package com.example.demo.user;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UserService {

	 private  UserRepository userRepository;
	 
	 

	    public UserService() {
		super();
		// TODO Auto-generated constructor stub
	}

	    


		public UserService(UserRepository userRepository) {
			super();
			this.userRepository = userRepository;
		}




		public List<User> getAllUserDetails() throws Exception{
	        try{
	            return userRepository.findAll();
	        }catch(Exception ex){
	            throw new Exception();
	        }
	    }
}
