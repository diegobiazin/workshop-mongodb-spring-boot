package com.diegobiazin.workshopmongodb.services;

import com.diegobiazin.workshopmongodb.domain.User;
import com.diegobiazin.workshopmongodb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> findAll() {
        return repo.findAll();
    }
}
