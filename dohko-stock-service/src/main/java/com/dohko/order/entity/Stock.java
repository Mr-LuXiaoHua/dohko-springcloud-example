package com.dohko.order.entity;

import lombok.Data;

/**
 * 库存
 */
@Data
public class Stock {

    private Long id;

    /**
     * 商品编码
     */
    private String commodityCode;

    /**
     * 商品数量
     */
    private Integer num;

}
