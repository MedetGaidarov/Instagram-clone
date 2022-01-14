package io.javaMed.postservice.controller;


import io.javaMed.postservice.VO.ResponseTemplateVO;
import io.javaMed.postservice.model.Post;
import io.javaMed.postservice.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/posts")
public class PostController {


    @Autowired
    private PostService postService;

    @PostMapping("/")
    public Post savePost(@RequestBody Post post)
    {
       return postService.savePost(post);
    }

    @GetMapping("/{id}")
    public ResponseTemplateVO getPostWithUser(@PathVariable("id") Long postId)
    {

        return postService.getPostWithUser(postId);
    }


    @GetMapping("/count/{userId}")
    public Long getNumberOfPostsOfUser(@PathVariable("userId") Long userId)
    {
        return postService.getPostNumberOfPosts(userId);
    }




}
