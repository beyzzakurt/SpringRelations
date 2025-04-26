package com.beyzakurt.repository;

import com.beyzakurt.entities.Home;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IHomeRepository extends JpaRepository<Home, Long> {

}
