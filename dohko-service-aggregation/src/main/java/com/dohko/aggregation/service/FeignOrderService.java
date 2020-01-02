package com.dohko.aggregation.service;

import com.dohko.aggregation.dto.CreateOrderReqDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @Description feign调用订单服务
 * @Author luxiaohua
 * @Date 2019/8/16
 */

@FeignClient(value = "DOHKO-ORDER-SERVICE", fallback = FeignOrderServiceFallback.class)
public interface FeignOrderService {

    @PostMapping("/order-service/create")
    boolean create(@RequestBody CreateOrderReqDTO createOrderReqDTO);
}
