package com.beyzakurt.repository;

import com.beyzakurt.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomerRepository  extends JpaRepository<Customer, Long> {

}
