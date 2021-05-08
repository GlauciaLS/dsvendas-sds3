package com.devsuperior.dsvendas.dto;

import com.devsuperior.dsvendas.entities.Seller;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SellerDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;

    public SellerDTO(Seller seller) {
        id = seller.getId();
        name = seller.getName();
    }

}
