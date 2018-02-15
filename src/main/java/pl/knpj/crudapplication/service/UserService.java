package pl.knpj.crudapplication.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import pl.knpj.crudapplication.entity.User;

public interface UserService {

    public Page<User> findAll(Pageable pageable);

    public User save(User user);

    public User findOne(Long userId);
}
