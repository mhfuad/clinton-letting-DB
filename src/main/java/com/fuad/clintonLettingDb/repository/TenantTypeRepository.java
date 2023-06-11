package com.fuad.clintonLettingDb.repository;

import com.fuad.clintonLettingDb.entity.TenantType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TenantTypeRepository extends JpaRepository<TenantType,Long> {

}