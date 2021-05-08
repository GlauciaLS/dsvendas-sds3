package com.devsuperior.dsvendas.dto;

import com.devsuperior.dsvendas.entities.Seller;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class SaleSumDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private String sellerName;
    private Double sum;

    public SaleSumDTO(Seller seller, Double sum) {
        sellerName = seller.getName();
        this.sum = sum;
    }
}
