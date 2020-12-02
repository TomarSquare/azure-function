package com.cts.azure.function.repository;

import com.cts.azure.function.domains.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends MongoRepository<User, Integer> {


}