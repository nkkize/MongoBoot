/**
 * 
 */
package com.mongoboot.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.mongoboot.persistence.entities.Question;
import com.mongoboot.persistence.repositories.QuestionRepository;

/**
 * @author narenderk
 *
 */
@RestController
public class DataController {
	
	@Autowired
	private QuestionRepository questionRepository;
	
	@RequestMapping(value = "/ask", method = RequestMethod.POST)
	public ModelAndView ask(@RequestParam String title, @RequestParam String input){
		questionRepository.save(new Question(title, input));
		ModelAndView model = new ModelAndView();
		List<Question> questions = questionRepository.findAll();
		if (questions != null) {
			questions = questions.isEmpty() ? null : questions;
		}
		model.addObject("questions", questions);
		model.setViewName("questions");
		return model;
	}
	
	@RequestMapping("/questions")
	public ModelAndView questions(){
		List<Question> questions = questionRepository.findAll();
		ModelAndView model = new ModelAndView();
		if (questions != null) {
			questions = questions.isEmpty() ? null : questions;
		}
		model.addObject("questions", questions);
		model.setViewName("questions");
		return model;
	}

	
	
	

}
