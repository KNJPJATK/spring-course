package pl.knpj.crudapplication.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import pl.knpj.crudapplication.entity.Post;

public interface PostService {

    public Page<Post> findAll(Pageable pageable);

    public Post findOne(Long postId);

    public Post save(Post post);

}
