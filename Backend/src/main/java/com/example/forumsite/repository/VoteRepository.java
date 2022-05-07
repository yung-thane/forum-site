package com.example.forumsite.repository;

import com.example.forumsite.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface VoteRepository extends JpaRepository<Vote, Long> {
}
