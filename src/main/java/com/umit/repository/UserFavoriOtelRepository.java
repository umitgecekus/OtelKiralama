package com.umit.repository;

import com.umit.domain.UserFavoriOtel;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserFavoriOtelRepository extends MongoRepository<UserFavoriOtel, String> {
    List<UserFavoriOtel> findByUserId(String userId);

}
