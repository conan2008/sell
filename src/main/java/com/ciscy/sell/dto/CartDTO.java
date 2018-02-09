package com.ciscy.sell.dto;

import lombok.Data;

/**
 * Created by zhangyuan on 2018/2/9.
 */
@Data
public class CartDTO {

    private String productId;
    private Integer productQuantity;

    public CartDTO() {}

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
