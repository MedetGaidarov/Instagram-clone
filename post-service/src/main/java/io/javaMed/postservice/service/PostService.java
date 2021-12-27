package io.javaMed.postservice.service;


import io.javaMed.postservice.VO.ResponseTemplateVO;
import io.javaMed.postservice.VO.User;
import io.javaMed.postservice.model.Post;
import io.javaMed.postservice.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    @Autowired
    private RestTemplate restTemplate;

    public Post savePost(Post post) {
        return postRepository.save(post);

    }

    public ResponseTemplateVO getPostWithUser(Long postId) {
        ResponseTemplateVO responseTemplateVO = new ResponseTemplateVO();
        Post post = postRepository.findByPostId(postId);

        User user = restTemplate.getForObject("http://localhost:9002/users/" + post.getUserId(), User.class);
        responseTemplateVO.setPost(post);
        responseTemplateVO.setUser(user);

        return responseTemplateVO;
    }
}
