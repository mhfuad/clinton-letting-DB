package com.fuad.clintonLettingDb.repository;

import com.fuad.clintonLettingDb.entity.Tenancy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TenancyRepository extends JpaRepository<Tenancy, Long> {
}
