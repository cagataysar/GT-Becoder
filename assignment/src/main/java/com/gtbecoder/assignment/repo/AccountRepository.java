package com.gtbecoder.assignment.repo;

import com.gtbecoder.assignment.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository< Account, Long >{
}
