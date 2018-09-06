package com.bigsea.sell.dto;

import lombok.Data;

/**
 * 购物车
 */
@Data
public class CartDTO {

    //商品id
    private String productId;

    //商品数量
    private Integer productQuantity;


}
