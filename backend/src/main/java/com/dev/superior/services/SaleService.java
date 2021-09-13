package com.dev.superior.services;

import com.dev.superior.dto.SaleDto;
import com.dev.superior.dto.SellerDto;
import com.dev.superior.entities.Sale;
import com.dev.superior.entities.Seller;
import com.dev.superior.repository.SaleRepository;
import com.dev.superior.repository.SellerRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SaleService {

    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private SaleRepository saleRepository;

    @Autowired
    protected SellerService sellerService;


    @Transactional(readOnly = true)
    public Page<SaleDto> findAll(Pageable pageable){
        sellerService.findAll();
        Page<Sale> result = saleRepository.findAll(pageable);
        return result.map(SaleDto::new);
    }

}
