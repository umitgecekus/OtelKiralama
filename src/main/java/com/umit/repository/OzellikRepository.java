package com.umit.repository;

import com.umit.domain.Ozellik;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.nio.file.Path;
import java.util.List;
import java.util.Optional;

public interface OzellikRepository extends MongoRepository<Ozellik, String> {


    List<Ozellik> findAllByParentName(String parentName);


}
