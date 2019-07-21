package com.oauth.security.springsecurityauthserver.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oauth.security.springsecurityauthserver.model.Users;

public interface UsersRepository extends JpaRepository<Users, Integer> {

	Optional<Users> findByName(String name);
}
