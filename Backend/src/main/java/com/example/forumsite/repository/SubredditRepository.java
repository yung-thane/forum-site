package com.example.forumsite.repository;

import com.example.forumsite.model.Subreddit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface SubredditRepository extends JpaRepository<Subreddit, Long> {
}
