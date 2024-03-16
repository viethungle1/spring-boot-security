package com.example.secondspringboot.repository;

import com.example.secondspringboot.model.AppUser;
import org.springframework.data.repository.CrudRepository;

public interface AppUserRepo extends CrudRepository<AppUser, Long> {
    AppUser findByName(String name);
}
