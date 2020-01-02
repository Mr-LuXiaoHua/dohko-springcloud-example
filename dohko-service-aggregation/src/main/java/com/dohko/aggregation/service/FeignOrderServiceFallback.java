package com.dohko.aggregation.service;

import com.dohko.aggregation.dto.CreateOrderReqDTO;
import org.springframework.stereotype.Component;

@Component
public class FeignOrderServiceFallback implements FeignOrderService {

    @Override
    public boolean create(CreateOrderReqDTO order) {
        return false;
    }
}
