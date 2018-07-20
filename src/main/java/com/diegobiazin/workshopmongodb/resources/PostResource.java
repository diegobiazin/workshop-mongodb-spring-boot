package com.diegobiazin.workshopmongodb.resources;

import com.diegobiazin.workshopmongodb.domain.Post;
import com.diegobiazin.workshopmongodb.domain.User;
import com.diegobiazin.workshopmongodb.dto.UserDTO;
import com.diegobiazin.workshopmongodb.resources.util.URL;
import com.diegobiazin.workshopmongodb.services.PostService;
import com.diegobiazin.workshopmongodb.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/posts")
public class PostResource {

    @Autowired
    private PostService postService;

    @GetMapping(path = "/{id}")
    public ResponseEntity<Post> findById(@PathVariable String id) {
        Post obj = postService.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @GetMapping(path = "/titlesearch")
    public ResponseEntity<List<Post>> findByTitle(@RequestParam(value = "text", defaultValue = "") String text) {
        text = URL.decodeParam(text);
        List<Post> list = postService.findByTitle(text);
        return ResponseEntity.ok().body(list);
    }
}
