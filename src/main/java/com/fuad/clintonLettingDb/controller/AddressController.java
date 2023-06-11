package com.fuad.clintonLettingDb.controller;

import com.fuad.clintonLettingDb.dto.AddressRequest;
import com.fuad.clintonLettingDb.entity.Address;
import com.fuad.clintonLettingDb.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @GetMapping("/all")
    public ResponseEntity<?> allAddress(){
        return new ResponseEntity<>(addressService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getAddress(@RequestParam Long id){
        return new ResponseEntity<>(addressService.findById(id), HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<?> saveAddress(@RequestBody AddressRequest addressRequest){
        Address address = addressService.save(addressRequest);
        return new ResponseEntity<>("Save successfully", HttpStatus.OK);
    }



}
