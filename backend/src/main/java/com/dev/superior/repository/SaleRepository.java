package com.dev.superior.repository;

import com.dev.superior.dto.utils.SaleSuccessDto;
import com.dev.superior.dto.utils.SaleSumDto;
import com.dev.superior.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SaleRepository extends JpaRepository<Sale, Long> {

    @Query("SELECT  new com.dev.superior.dto.utils.SaleSumDto(obj.seller, SUM(obj.amount))  FROM Sale AS obj GROUP BY obj.seller")
    List<SaleSumDto> amountGroupedBySeller();

    @Query("SELECT  new com.dev.superior.dto.utils.SaleSuccessDto(obj.seller, SUM(obj.visited), sum(obj.deals))  FROM Sale AS obj GROUP BY obj.seller")
    List<SaleSuccessDto> successGroupedBySeller();
}
