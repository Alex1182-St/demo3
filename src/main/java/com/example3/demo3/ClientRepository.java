package com.example3.demo3;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<ClientEntity, String> {
}
// extends JpaRepository<"OurEntity Class Name", “Type of variable with @Id in OurEntity Class”>

