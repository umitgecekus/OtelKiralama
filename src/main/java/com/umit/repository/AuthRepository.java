package com.umit.repository;

import com.umit.domain.Auth;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;
import java.util.UUID;

public interface AuthRepository extends MongoRepository<Auth, UUID> {
    Optional<Auth> findByUsernameAndPassword(String username, String password);
    Optional<Auth> findByEmail(String email);
    Optional<Auth> findById(String id);


}
