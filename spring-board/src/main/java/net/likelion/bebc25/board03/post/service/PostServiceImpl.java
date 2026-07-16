package net.likelion.bebc25.board03.post.service;

import net.likelion.bebc25.board03.post.dto.PostDto;
import net.likelion.bebc25.board03.post.repository.PostRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // 실제 일(서비스)을 하는 핵심 일꾼
public class PostServiceImpl implements PostService { // implements 를 사용하면 오타 발생시 알려줌

    private final PostRepository postRepository; // postRepository 보물상자에서 데이터 가져옴

    public PostServiceImpl(@Qualifier("jdbcTemplatePostRepository")PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public List<PostDto> getPosts() { // 모든 글 보여주기
        return postRepository.findALL(); // 모든 글 리스트를 꺼내어 전달
    }

    @Override
    public PostDto getPost(int id) { // 딱 하나의 글만 찾아서 보여주기
        return postRepository.findById(id); // id 가 글 번호이므로 번호에 해당하는 글 찾아서 전달
    }

    @Override
    public void writePost(PostDto post) { // 새로운 글 쓰기
        postRepository.save(post); // post 는 사용자가 쓴 글이므로 그 글을 안전하게 저장
    }

    @Override
    public void editPost(PostDto post) { // 글 수정하기
        postRepository.update(post); // 예전 글을 새롭게 업데이트해서 바꾸어줌
    }

    @Override
    public void removePost(int id) { // 글 지우기
        postRepository.deleteById(id); // 해당 번호 (id)를 가진 글 찾아서 영원히 삭제
    }
}
