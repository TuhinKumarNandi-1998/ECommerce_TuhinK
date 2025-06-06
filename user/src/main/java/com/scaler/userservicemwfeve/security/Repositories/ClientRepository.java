package com.scaler.userservicemwfeve.security.Repositories;

import java.util.Optional;
import com.scaler.userservicemwfeve.security.Models.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, String> {
    Optional<Client> findByClientId(String clientId);
}
