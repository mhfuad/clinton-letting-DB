package com.fuad.clintonLettingDb.repository;

import com.fuad.clintonLettingDb.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
