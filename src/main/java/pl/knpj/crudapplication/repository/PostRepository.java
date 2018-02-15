package pl.knpj.crudapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.knpj.crudapplication.entity.Post;

public interface PostRepository extends JpaRepository<Post, Long> {
}
