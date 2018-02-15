package pl.knpj.crudapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.knpj.crudapplication.entity.Post;
import pl.knpj.crudapplication.service.PostService;

@Controller
@RequestMapping("/post")
public class PostController {

    @Autowired
    private PostService postService;

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody Page<Post> findAll(Pageable pageable) {
        return postService.findAll(pageable);
    }

    @RequestMapping(value = "/{postId}", method = RequestMethod.GET)
    public @ResponseBody Post findOne(@PathVariable Long postId) {
        return postService.findOne(postId);
    }

    @RequestMapping(method = RequestMethod.POST)
    public @ResponseBody Post save(@RequestBody Post post) {
        return postService.save(post);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public @ResponseBody Post update(@RequestBody Post post) {
        return postService.save(post);
    }

}
