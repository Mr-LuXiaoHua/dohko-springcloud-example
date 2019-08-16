package com.dohko.order.controller;

import com.dohko.order.entity.Order;
import com.dohko.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description order 控制器
 * @Author luxiaohua
 * @Date 2019/8/16
 */

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/orders/{id}")
    public Order order(@PathVariable Long id) {
        return orderService.getById(id);
    }



}
