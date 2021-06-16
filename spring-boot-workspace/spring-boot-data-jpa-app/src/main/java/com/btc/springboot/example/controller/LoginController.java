package com.btc.springboot.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.btc.springboot.example.dto.Credentials;
import com.btc.springboot.example.dto.JwtToken;
import com.btc.springboot.example.util.JwtUtil;

@RestController
@CrossOrigin
public class LoginController {
	
	@Autowired
	JwtUtil util;
	
	@Autowired
	AuthenticationManager authMgr;
	
	@Autowired
	UserDetailsService userDetailsService;
	
	@PostMapping("/api/public/login")
	public JwtToken getToken(@RequestBody Credentials cred) {
		authMgr.authenticate(new UsernamePasswordAuthenticationToken(cred.getUsername(), cred.getPassword()));
		
		UserDetails userDetails=userDetailsService.loadUserByUsername(cred.getUsername());
		
		String token=util.generateToken(userDetails);
		JwtToken jwtToken=new JwtToken(token);
		
		return jwtToken;
		
	}

}
