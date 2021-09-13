package com.dev.superior.dto;


import com.dev.superior.entities.Seller;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Builder
@AllArgsConstructor
@Data
@NoArgsConstructor
public class SellerDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private  String name;

    public SellerDto(Seller seller){
        id = seller.getId();
        name = seller.getName();
    }



}
