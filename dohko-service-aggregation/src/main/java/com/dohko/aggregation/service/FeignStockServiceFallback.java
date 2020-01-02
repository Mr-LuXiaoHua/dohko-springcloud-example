package com.dohko.aggregation.service;

import org.springframework.stereotype.Component;

@Component
public class FeignStockServiceFallback implements FeignStockService {

    @Override
    public boolean deduct(String commodityCode, Integer num) {
        return false;
    }
}
