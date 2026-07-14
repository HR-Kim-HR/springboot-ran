package net.likelion.bebc25.board01.post.dto;

import java.time.LocalDateTime;

// 게시글 하나를 저장할 객체 // 데이터 보관을 편리하게 하기 위한 객체 // Data Transfer Object
public class PostDto {
    private int id;
    private String title;
    private String content;
    private String author;
    private LocalDateTime createdAt;

    public PostDto(){}

    public PostDto(String title, String author, String content) {
        this.title = title;
        this.author = author;
        this.content = content;
    }

    public PostDto(int id, String title, String content, String author, LocalDateTime createdAt) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.author = author;
        this.createdAt = createdAt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "PostDto{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", author='" + author + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}
