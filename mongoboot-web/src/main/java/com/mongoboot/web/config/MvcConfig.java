/**
 * 
 */
package com.mongoboot.web.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author narenderk
 *
 */
@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter{
	
	@Override
	public void addViewControllers(ViewControllerRegistry registry){
		registry.addViewController("/").setViewName("home");
		registry.addViewController("/home").setViewName("home");
        registry.addViewController("/aboutus").setViewName("aboutus");
        registry.addViewController("/users").setViewName("users");
	}

}
