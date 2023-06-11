package com.fuad.clintonLettingDb.repository;

import com.fuad.clintonLettingDb.entity.PropertyType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PropertyTypeRepository extends JpaRepository<PropertyType, Long> {

}
