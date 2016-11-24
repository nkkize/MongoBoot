/**
 * 
 */
package com.mongoboot.persistence.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author narenderk
 *
 */
@Document(collection = "questions")
public class Question {
	
	@Id
	private String id;
	
	private String title;
	
	private String input;
	
	 public Question(String title, String input) {
	        this.title = title;
	        this.input = input;
	    }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
	}

	@Override
	public String toString() {
		return "Question [id=" + id + ", title=" + title + ", input=" + input + "]";
	}

}
