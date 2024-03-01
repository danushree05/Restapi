package com.pmsmapping.pmsmapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pmsmapping.pmsmapping.model.UserAccount;

public interface UserAccountRepo extends JpaRepository<UserAccount,Long>{
    
}
