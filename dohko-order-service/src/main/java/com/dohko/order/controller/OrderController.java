package com.dohko.order.controller;

import com.dohko.order.entity.Order;
import com.dohko.order.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description order 控制器
 * @Author luxiaohua
 * @Date 2019/8/16
 */

@RestController
@Slf4j
@RequestMapping("/order-service")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/create")
    public boolean create(@RequestBody Order order) {
        log.info("订单参数:{}", order);
        orderService.create(order);
        return true;
    }

}
