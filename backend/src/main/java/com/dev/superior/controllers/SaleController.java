package com.dev.superior.controllers;

import com.dev.superior.dto.SaleDto;
import com.dev.superior.dto.utils.SaleSuccessDto;
import com.dev.superior.dto.utils.SaleSumDto;
import com.dev.superior.services.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {


    @Autowired
    private SaleService saleService;


    @GetMapping("/")
    public ResponseEntity<Page<SaleDto>> findAll(Pageable pageable){
        Page<SaleDto> list = saleService.findAll(pageable);
        return ResponseEntity.ok(list);
    }

    @GetMapping("/amount-by-seller")
    public ResponseEntity<List<SaleSumDto>> amountGroupBySeller(){
        List<SaleSumDto > list = saleService.amountGroupedBySeller();
        return ResponseEntity.ok(list);
    }


    @GetMapping("/success-by-seller")
    public ResponseEntity<List<SaleSuccessDto>> successGroupedBySeller(){
        List<SaleSuccessDto > list = saleService.successGroupedBySeller();
        return ResponseEntity.ok(list);
    }
}
