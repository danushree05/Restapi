package com.pmsonetomany.pmsonetomany.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pmsonetomany.pmsonetomany.model.Client;

// import ch.qos.logback.core.net.server.Client;

public interface ClientRepo extends JpaRepository<Client,Long> {
    
}
