package com.fuad.clintonLettingDb.repository;

import com.fuad.clintonLettingDb.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
}
