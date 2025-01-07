package com.umit.repository;

import com.umit.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepository extends MongoRepository<User, String> {
    Optional<User> findByAuthId(String id);
    Optional<User> findOptionalByAuthId(String authId);
}
