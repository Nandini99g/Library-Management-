package com.asses.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.asses.library.dto.AuthorSaveDTO;
import com.asses.library.service.AuthorService;

@RestController
@CrossOrigin
@RequestMapping("api/books/author")
public class AuthorController {

	@Autowired
	private AuthorService authorService;
	
	@PostMapping("/save")
	public String saveAuthor(@RequestBody AuthorSaveDTO authorSaveDTO) {
		String authorname= authorService.addAuthor(authorSaveDTO);
		return "Author Added successfully!!";
	}
}