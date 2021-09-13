package com.dev.superior.controllers;


import com.dev.superior.dto.SellerDto;
import com.dev.superior.services.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.text.html.parser.Entity;
import java.util.List;

@RestController
@RequestMapping("/sellers")
public class SellerController {

    @Autowired
    private SellerService sellerService;


    @GetMapping("/")
    public ResponseEntity<List<SellerDto>> findAll(){
        List<SellerDto> list = sellerService.findAll();
        return ResponseEntity.ok(list);
    }



}
