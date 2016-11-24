/**
 * 
 */
package com.mongoboot.persistence.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * @author narenderk
 *
 */
@Configuration
@EnableMongoRepositories(basePackages = {"com.mongoboot.persistence.repositories"})
public class PersistenceConfig {

}
