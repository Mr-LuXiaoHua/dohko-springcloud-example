package com.dohko.aggregation.controller;

import com.dohko.aggregation.dto.CreateOrderReqDTO;
import com.dohko.aggregation.service.FeignOrderService;
import com.dohko.aggregation.service.FeignStockService;
import org.apache.commons.lang.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Objects;

@RestController
@RequestMapping("/aggregation-service")
public class AggregationController {

    @Resource
    private FeignOrderService feignOrderService;

    @Resource
    private FeignStockService feignStockService;


    @PostMapping("/unified-order")
    public String unifiedOrder(CreateOrderReqDTO reqDTO) {
        String result;
        try {
            check(reqDTO);
            // 调订单服务创建订单
            feignOrderService.create(reqDTO);
            // 调库存服务扣减库存
            feignStockService.deduct(reqDTO.getCommodityCode(), reqDTO.getQuantity());
            result = "success";
        } catch (Exception e) {
            e.printStackTrace();
            result = e.getMessage();
        }
        return result;
    }


    private void check(CreateOrderReqDTO reqDTO) {
        if (Objects.isNull(reqDTO.getUserId())) {
            throw new IllegalArgumentException("用户标识为空");
        }

        if (StringUtils.isBlank(reqDTO.getCommodityCode())) {
            throw new IllegalArgumentException("商品编码为空");
        }

        if (Objects.isNull(reqDTO.getAmount()) || reqDTO.getAmount().intValue() < 0) {
            throw new IllegalArgumentException("订单金额不能小0");
        }

        if (Objects.isNull(reqDTO.getQuantity()) || reqDTO.getQuantity().intValue() < 1) {
            throw new IllegalArgumentException("商品数量不能小于1");
        }

    }
}
