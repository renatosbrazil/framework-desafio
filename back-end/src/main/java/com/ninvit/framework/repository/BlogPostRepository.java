package com.ninvit.framework.repository;

import java.util.Optional;

import com.ninvit.framework.models.BlogPost;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogPostRepository extends JpaRepository<BlogPost, Long> {
    void deleteBlogPostById(Long id);

    Optional<BlogPost> findBlogPostById(Long id);
}
