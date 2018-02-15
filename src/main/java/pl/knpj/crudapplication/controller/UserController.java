package pl.knpj.crudapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.knpj.crudapplication.entity.User;
import pl.knpj.crudapplication.service.UserService;

@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody Page<User> findAll(Pageable pageable) {
        return userService.findAll(pageable);
    }

    @RequestMapping(value = "/{userId}", method = RequestMethod.GET)
    public @ResponseBody User findOne(@PathVariable("userId") Long userId) {
        return userService.findOne(userId);
    }

    @RequestMapping(method = RequestMethod.POST)
    public @ResponseBody User save(@RequestBody User user) {
        return userService.save(user);
    }

}
