package com.umit.repository;

import com.umit.domain.OtelOzellik;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OtelOzellikRepository extends MongoRepository<OtelOzellik, String> {
}
