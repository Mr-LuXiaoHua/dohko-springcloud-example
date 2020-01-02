package com.dohko.order.entity;

import lombok.Data;

/**
 * @Description 订单
 * @Author luxiaohua
 * @Date 2019/8/16
 */
@Data
public class Order {

    private Long id;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 商品编码
     */
    private String commodityCode;

    /**
     * 购买数量
     */
    private Integer quantity;


    /**
     * 总金额
     */
    private Integer amount;


    @Override
    public String toString() {
        return "Order{" +
                "userId=" + userId +
                ", commodityCode='" + commodityCode + '\'' +
                ", quantity=" + quantity +
                ", amount=" + amount +
                '}';
    }
}
