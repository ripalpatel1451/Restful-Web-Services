package com.ripal.rest.webservices.restfulwebservices.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
public class UserJPAController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PostRepository postRepository;

    @RequestMapping(method = RequestMethod.GET, path = "/jpa/users")
    public List<User> retriveAllUsers(){
        return userRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST, path = "/jpa/users")
    public ResponseEntity<Object> createUser(@Valid @RequestBody User user){
        User savedUser = userRepository.save(user);

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedUser.getId())
                .toUri();
        return ResponseEntity.created(location).build();
    }

    @RequestMapping(method = RequestMethod.GET,path = "/jpa/users/{id}")
    public User retriveUser(@PathVariable int id){
        Optional<User> user = userRepository.findById(id);
        if(!user.isPresent()){
            throw new UserNotFoundException("id-"+ id);
        }

        //retriveAllUsers

        return user.get();
    }

    @RequestMapping(method = RequestMethod.DELETE,path = "/jpa/users/{id}")
    public void deleteUser(@PathVariable int id){
        userRepository.deleteById(id);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/jpa/users/{id}/posts")
    public List<Post> retriveAllUserPosts(@PathVariable int id){
        Optional<User> byId = userRepository.findById(id);
        if(!byId.isPresent()){
            throw new UserNotFoundException("id-"+ id);
        }
        return byId.get().getPosts();
    }

    @RequestMapping(method = RequestMethod.POST, path = "/jpa/users/{id}/posts")
    public ResponseEntity<Object> createPost(@PathVariable int id, @Valid @RequestBody Post post){

        Optional<User> byId = userRepository.findById(id);
        if(!byId.isPresent()){
            throw new UserNotFoundException("id-"+ id);
        }

        User user = byId.get();

        post.setUser(user);
        postRepository.save(post);

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(post.getId())
                .toUri();
        return ResponseEntity.created(location).build();
    }


    @RequestMapping(method = RequestMethod.GET,path = "/jpa/users/{id}/posts/{post_id}")
    public Post retrivePost(@PathVariable int id, @PathVariable int post_id){
        Optional<User> byId = userRepository.findById(id);
        if(!byId.isPresent()){
            throw new UserNotFoundException("id-"+ id);
        }

//        User user = byId.get();
        Optional<Post> post = postRepository.findById(post_id);
        if(!post.isPresent()){
            throw new UserNotFoundException("id-"+ post_id);
        }
        //retriveAllUsers

        return post.get();
    }

}
