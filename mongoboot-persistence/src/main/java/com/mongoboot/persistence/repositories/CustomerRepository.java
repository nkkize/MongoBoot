/**
 * 
 */
package com.mongoboot.persistence.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mongoboot.persistence.entities.Customer;

/**
 * @author narenderk
 *
 */
@Repository
public interface CustomerRepository extends MongoRepository<Customer, String>{
	
	public Customer findByFirstName(String firstName);
	public List<Customer> findByLastName(String lastName);

}
