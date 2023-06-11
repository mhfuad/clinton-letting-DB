package com.fuad.clintonLettingDb.repository;

import com.fuad.clintonLettingDb.entity.PartUsed;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartUsedRepository extends JpaRepository<PartUsed, Long> {
}
