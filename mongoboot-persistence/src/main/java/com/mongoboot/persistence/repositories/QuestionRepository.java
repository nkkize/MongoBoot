/**
 * 
 */
package com.mongoboot.persistence.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mongoboot.persistence.entities.Question;

/**
 * @author narenderk
 *
 */
@Repository
public interface QuestionRepository extends MongoRepository<Question, String>{

}
