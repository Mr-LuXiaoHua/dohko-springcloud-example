package com.dohko.order.service;

import com.dohko.order.entity.Order;

/**
 * @Description 订单服务接口
 * @Author luxiaohua
 * @Date 2019/8/16
 */
public interface OrderService {

    Order getById(Long id);

    /**
     * 创建订单
     * @param userId    用户id
     * @param commodityCode 商品编码
     * @param quantity  数量
     */
    void create(Long userId, String commodityCode, Integer quantity);
}
