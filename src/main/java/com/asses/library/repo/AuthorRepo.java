package com.asses.library.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.asses.library.entity.Author;

@Repository
public interface AuthorRepo extends JpaRepository<Author, Integer>{

}
