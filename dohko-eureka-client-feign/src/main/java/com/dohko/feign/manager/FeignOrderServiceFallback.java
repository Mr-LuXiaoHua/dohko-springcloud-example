package com.dohko.feign.manager;

import com.dohko.feign.dto.Order;
import org.springframework.stereotype.Component;

@Component
public class FeignOrderServiceFallback implements FeignOrderService {

    @Override
    public Order getById(Long id) {
        System.out.println("订单服务已熔断");
        return new Order();
    }
}
