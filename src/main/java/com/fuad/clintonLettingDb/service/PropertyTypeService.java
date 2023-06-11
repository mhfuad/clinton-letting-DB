package com.fuad.clintonLettingDb.service;

import com.fuad.clintonLettingDb.repository.PropertyTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PropertyTypeService {
    @Autowired
    private PropertyTypeRepository propertyTypeRepository;
}
