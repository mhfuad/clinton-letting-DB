package com.fuad.clintonLettingDb.repository;

import com.fuad.clintonLettingDb.entity.Tenant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TenantRepository extends JpaRepository<Tenant, Long> {
}
