package com.btc.springboot.example.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.btc.springboot.example.model.User;
import com.btc.springboot.example.repository.AuthUserDetails;
import com.btc.springboot.example.repository.UserRepo;

@Service
public class AppUserDetailsService implements UserDetailsService {
	
	@Autowired
	UserRepo repo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user=repo.findByUsername(username);
		return new AuthUserDetails(user);
	}

}
