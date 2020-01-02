package com.dohko.aggregation.dto;

import lombok.Data;

/**
 * @Description 创建订单请求DTO
 * @Author luxiaohua
 * @Date 2019/8/16
 */
@Data
public class CreateOrderReqDTO {

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
}
