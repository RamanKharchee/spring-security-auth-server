package com.oauth.security.springsecurityauthserver.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.oauth.security.springsecurityauthserver.model.CustomUserDetails;
import com.oauth.security.springsecurityauthserver.repository.UsersRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	private UsersRepository userRepo;

	@Override
	public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {

		return userRepo.findByName(name).map(user -> new CustomUserDetails(user)).get();
	}

}
