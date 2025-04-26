package com.beyzakurt.repository;

import com.beyzakurt.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAddressRepository extends JpaRepository<Address, Long> {

}
