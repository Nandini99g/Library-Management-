package com.asses.library.service.IMPL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asses.library.dto.AuthorSaveDTO;
import com.asses.library.entity.Author;
import com.asses.library.repo.AuthorRepo;
import com.asses.library.service.AuthorService;

@Service
public class AuthorServiceImpl implements AuthorService {

	@Autowired
	private AuthorRepo authorRepo;
	
	@Override
	public String addAuthor(AuthorSaveDTO authorSaveDTO) {
		
		Author author = new Author(authorSaveDTO.getName());
		
		authorRepo.save(author);
		
		return author.getName();
	}

}
