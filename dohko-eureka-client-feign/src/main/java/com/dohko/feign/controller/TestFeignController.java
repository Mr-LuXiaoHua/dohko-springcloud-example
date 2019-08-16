package com.dohko.feign.controller;

import com.dohko.feign.dto.Order;
import com.dohko.feign.manager.FeignOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author luxiaohua
 * @Date 2019/8/16
 */
@RestController
public class TestFeignController {

    @Autowired
    private FeignOrderService feignOrderService;

    @GetMapping("/feign-test")
    public Order getById() {
        Long id = 1L;
        return feignOrderService.getById(id);
    }
}
