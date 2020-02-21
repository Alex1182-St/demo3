package com.example3.demo3;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientImportanceRepository extends JpaRepository<ClientImportanceEntity, String> {
}
