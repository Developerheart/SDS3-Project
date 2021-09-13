package com.dev.superior.dto;

import com.dev.superior.entities.Sale;
import lombok.*;

import java.time.LocalDate;


@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class SaleDto {

    private Long id;

    private Integer visited;

    private Integer deals;

    private Double amount;

    private LocalDate date;

    private SellerDto sellerDto;


    public SaleDto(Sale entity){
        this.id = entity.getId();
        this.visited = entity.getVisited();
        this.deals = entity.getDeals();
        this.amount = entity.getAmount();
        this.date = entity.getDate();
        this.sellerDto =  new SellerDto(entity.getSeller());
    }

}
