package com.asses.library.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "author")
public class Author {
	
	 @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	 @Column(name = "author_id", length = 11)
	    private int authorid;
	 
	 @Column(name = "name", length = 50)
	    private String name;
	 
	 public Author() {}

	    // Constructor with name
	    public Author(String name) {
	        this.name = name;
	    }

	    // Getters and Setters
	    public int getAuthorId() {
	        return authorid;
	    }

	    public void setAuthorId(int authorId) {
	        this.authorid = authorId;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	@Override
	public String toString() {
		return "Author [authorid=" + authorid + ", name=" + name + "]";
	}

}
