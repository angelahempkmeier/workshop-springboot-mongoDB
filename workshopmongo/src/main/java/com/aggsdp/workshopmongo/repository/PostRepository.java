package com.aggsdp.workshopmongo.repository;

import com.aggsdp.workshopmongo.domain.Post;
import com.aggsdp.workshopmongo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}
