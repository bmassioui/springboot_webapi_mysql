package com.springbootapi.springboot_webapi_mysql.Repositories;

import com.springbootapi.springboot_webapi_mysql.Model.Customer;

import org.springframework.data.repository.CrudRepository;

/**
 * Customer Repository Design Pattern
 */
public interface CustomerRepository extends CrudRepository<Customer, Integer>{
    
}
