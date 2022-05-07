package com.example.forumsite.repository;

import com.example.forumsite.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
//Post is our entity, Long is the type of our primary key.
public interface PostRepository extends JpaRepository<Post, Long> {
}
