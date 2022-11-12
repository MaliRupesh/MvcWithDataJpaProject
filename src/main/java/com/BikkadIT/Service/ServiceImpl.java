package com.BikkadIT.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BikkadIT.Repository.UserRepository;
import com.BikkadIT.modul.User;

@Service
public class ServiceImpl implements ServiceI {
    @Autowired
	private UserRepository userRepository;
	
	
	@Override
	public User saveuser(User user) {
		
		User save = userRepository.save(user);
		return save;
	}

}
