package com.fuad.clintonLettingDb.repository;

import com.fuad.clintonLettingDb.entity.Part;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartRepository extends JpaRepository<Part, Long> {
}
