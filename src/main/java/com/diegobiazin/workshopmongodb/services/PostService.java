package com.diegobiazin.workshopmongodb.services;

import com.diegobiazin.workshopmongodb.domain.Post;
import com.diegobiazin.workshopmongodb.domain.User;
import com.diegobiazin.workshopmongodb.dto.UserDTO;
import com.diegobiazin.workshopmongodb.repository.PostRepository;
import com.diegobiazin.workshopmongodb.repository.UserRepository;
import com.diegobiazin.workshopmongodb.services.exception.ObjectNotFoundException;
import javafx.geometry.Pos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repo;

    public Post findById(String id) {
        Optional<Post> user = repo.findById(id);
        return user.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }
}
