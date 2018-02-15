package pl.knpj.crudapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.knpj.crudapplication.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
