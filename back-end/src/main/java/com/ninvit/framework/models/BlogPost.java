package com.ninvit.framework.models;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BlogPost implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String title;
    private String text;
    private String comment;
    private String imageUrl;

    public BlogPost() {
    }

    public BlogPost(Long id, String title, String text, String comment, String imageUrl) {
        this.id = id;
        this.title = title;
        this.text = text;
        this.comment = comment;
        this.imageUrl = imageUrl;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getComment() {
        return this.comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public BlogPost id(Long id) {
        setId(id);
        return this;
    }

    public BlogPost title(String title) {
        setTitle(title);
        return this;
    }

    public BlogPost text(String text) {
        setText(text);
        return this;
    }

    public BlogPost comment(String comment) {
        setComment(comment);
        return this;
    }

    public BlogPost imageUrl(String imageUrl) {
        setImageUrl(imageUrl);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof BlogPost)) {
            return false;
        }
        BlogPost blogPost = (BlogPost) o;
        return Objects.equals(id, blogPost.id) && Objects.equals(title, blogPost.title) && Objects.equals(text, blogPost.text) && Objects.equals(comment, blogPost.comment) && Objects.equals(imageUrl, blogPost.imageUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, text, comment, imageUrl);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", title='" + getTitle() + "'" +
            ", text='" + getText() + "'" +
            ", comment='" + getComment() + "'" +
            ", imageUrl='" + getImageUrl() + "'" +
            "}";
    }

   
}
