package com.dev.superior.dto.utils;


import com.dev.superior.entities.Seller;
import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class SaleSuccessDto implements Serializable {
    private static  final long serialVersionUID = 1L;

    private String sellerName;

    private Long visited;
    private Long deals;

    public SaleSuccessDto(Seller seller, Long visited, Long deals){
        this.sellerName = seller.getName();
        this.visited  = visited;
        this.deals = deals;

    }

}
