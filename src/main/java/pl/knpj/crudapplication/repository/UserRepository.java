package pl.knpj.crudapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.knpj.crudapplication.entity.User;

@Controller
@RequestMapping("/users")
public interface UserRepository extends JpaRepository<User, Long> {

    @RequestMapping(value = "/{username}", method = RequestMethod.GET)
    public @ResponseBody User findOneByUsername(@PathVariable("username") String username);

}
