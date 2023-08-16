package com.gtbecoder.assignment.repo;

import com.gtbecoder.assignment.model.Customer;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository< Customer, Long > {
}
