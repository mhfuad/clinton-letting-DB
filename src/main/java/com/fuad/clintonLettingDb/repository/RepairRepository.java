package com.fuad.clintonLettingDb.repository;

import com.fuad.clintonLettingDb.entity.Repair;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepairRepository extends JpaRepository<Repair, Long> {
}
