package com.dev.superior.dto.utils;


import com.dev.superior.entities.Seller;
import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class SaleSumDto  implements Serializable {
    private static  final long serialVersionUID = 1L;

    private String sellerName;

    private Double sum;

    public SaleSumDto(Seller seller, Double sum){
        this.sellerName = seller.getName();
        this.sum = sum;

    }

}
