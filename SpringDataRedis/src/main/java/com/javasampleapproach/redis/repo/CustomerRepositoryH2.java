package com.javasampleapproach.redis.repo;

import org.springframework.data.repository.CrudRepository;

import com.javasampleapproach.redis.model.Customer;

public interface CustomerRepositoryH2 extends CrudRepository<Customer, Integer>{

}
