package net.likelion.bebc25.board03.post.repository;

import net.likelion.bebc25.board03.post.dto.PostDto;

import java.util.List;

// 인터페이스는 카페 메뉴판 같은 역할 (DB 관련 인터페이스)
public interface PostRepository {
    List<PostDto> findALL(); // 모든 글을 찾아서 보여주도록
    PostDto findById(int id); // 번호를 누르면 그 글을 찾도록
    void save(PostDto post); // 글을 저장하도록
    void update(PostDto post); // 글을 수정하도록
    void deleteById(int id); // 번호에 해당하는 글을 삭제하도록
}
