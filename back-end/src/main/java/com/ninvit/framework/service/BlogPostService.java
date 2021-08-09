package com.ninvit.framework.service;

import java.util.List;

import javax.transaction.Transactional;

import com.ninvit.framework.exception.NotFoundException;
import com.ninvit.framework.models.BlogPost;
import com.ninvit.framework.repository.BlogPostRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class BlogPostService {
    private final BlogPostRepository blogPostRepo;

    @Autowired
    public BlogPostService(BlogPostRepository blogPostRepo) {
        this.blogPostRepo = blogPostRepo;
    }

    public BlogPost addBlogPost(BlogPost blogPost) {
        return blogPostRepo.save(blogPost);
    }       

    public List<BlogPost> findAllBlogPosts() {
        return blogPostRepo.findAll();
    }

    public BlogPost updateBlogPost(BlogPost blogPost) {
        return blogPostRepo.save(blogPost);
    }

    public BlogPost findBlogPostById(Long id) {
        return blogPostRepo.findBlogPostById(id)
                .orElseThrow(() -> new NotFoundException("Post with id " + id + " was not found"));
    }

    public void deleteBlogPost(Long id){
        blogPostRepo.deleteBlogPostById(id);
    }
}
