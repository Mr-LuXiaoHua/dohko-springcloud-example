package com.dohko.order.controller;

import com.dohko.order.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stock-service")
public class StockController {

    @Autowired
    private StockService stockService;

    @PostMapping("/deduct")
    public boolean deduct(@RequestParam String commodityCode, @RequestParam Integer num) {
        return stockService.deduct(commodityCode, num);
    }
}
