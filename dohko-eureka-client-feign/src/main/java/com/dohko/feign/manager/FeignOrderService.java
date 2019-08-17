package com.dohko.feign.manager;

import com.dohko.feign.dto.Order;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Description feign调用订单服务
 * @Author luxiaohua
 * @Date 2019/8/16
 */

@FeignClient(value = "DOHKO-EUREKA-CLIENT-ORDER-SERVICE", fallback = FeignOrderServiceFallback.class)
public interface FeignOrderService {

    @GetMapping("/orders/{id}")
    Order getById(@PathVariable Long id);
}
