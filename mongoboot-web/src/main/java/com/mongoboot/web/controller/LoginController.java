/**
 * 
 */
package com.mongoboot.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.mongoboot.persistence.repositories.CustomerRepository;

/**
 * @author narenderk
 *
 */
@RestController
public class LoginController {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public ModelAndView home() {
		ModelAndView model = new ModelAndView();
		model.setViewName("home");
		return model;
	}

}
