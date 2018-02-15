package pl.knpj.crudapplication.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import pl.knpj.crudapplication.entity.Post;
import pl.knpj.crudapplication.repository.PostRepository;
import pl.knpj.crudapplication.service.PostService;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    private PostRepository postRepository;

    @Override
    public Page<Post> findAll(Pageable pageable) {
        return postRepository.findAll(pageable);
    }

    @Override
    public Post findOne(Long postId) {
        return postRepository.findOne(postId);
    }

    @Override
    public Post save(Post post) {
        return postRepository.save(post);
    }
}
