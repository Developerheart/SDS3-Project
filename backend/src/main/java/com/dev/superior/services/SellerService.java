package com.dev.superior.services;

import com.dev.superior.dto.SellerDto;
import com.dev.superior.entities.Seller;
import com.dev.superior.repository.SellerRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SellerService {

    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private SellerRepository sellerRepository;

    public List<SellerDto> findAll(){

        List<Seller> result = sellerRepository.findAll();
        return result.stream().map(SellerDto::new).collect(Collectors.toList());
    }

}
