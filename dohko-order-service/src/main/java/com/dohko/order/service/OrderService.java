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
     */
    void create(Order order);
}
