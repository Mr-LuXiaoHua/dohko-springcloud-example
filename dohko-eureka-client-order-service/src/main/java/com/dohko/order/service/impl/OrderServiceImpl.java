package com.dohko.order.service.impl;

import com.dohko.order.entity.Order;
import com.dohko.order.mapper.OrderMapper;
import com.dohko.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Description 订单服务接口实现
 * @Author luxiaohua
 * @Date 2019/8/16
 */

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public Order getById(Long id) {
        return orderMapper.selectById(id);
    }

    @Override
    @Transactional
    public void create(Long userId, String commodityCode, Integer quantity) {

        int unitPrice = 10;
        int amount = unitPrice * quantity;

        Order order = new Order();
        order.setUserId(userId);
        order.setCommodityCode(commodityCode);
        order.setQuantity(quantity);
        order.setAmount(amount);

        orderMapper.insert(order);

    }
}
