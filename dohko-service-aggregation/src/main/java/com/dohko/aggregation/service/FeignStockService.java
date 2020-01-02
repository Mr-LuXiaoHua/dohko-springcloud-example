package com.dohko.aggregation.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient(value = "DOHKO-STOCK-SERVICE", fallback = FeignStockServiceFallback.class)
public interface FeignStockService {

    @PostMapping("/stock-service/deduct")
    boolean deduct(@RequestParam String commodityCode, @RequestParam Integer num);
}
