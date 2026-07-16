package net.likelion.bebc25.board03.post.service;

import net.likelion.bebc25.board03.post.dto.PostDto;

import java.util.List;

// 인터페이스는 카페 메뉴판 같은 역할 (사용자의 요청을 해결해주는 역할)
public interface PostService {
    List<PostDto> getPosts(); // 전체 글 가져오도록
    PostDto getPost(int id); // 글번호(id)에 해당하는 글 가져오도록
    void writePost(PostDto post); // 사용자가 글 작성할 수 있도록
    void editPost(PostDto post); // 사용자가 글 수정할 수 있도록
    void removePost(int id); // 사용자가 글 삭제할 수 있도록
}
