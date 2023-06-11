package com.fuad.clintonLettingDb.repository;

import com.fuad.clintonLettingDb.entity.Staff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffRepository extends JpaRepository<Staff, Long> {
}
