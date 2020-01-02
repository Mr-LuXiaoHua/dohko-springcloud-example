package com.dohko.order.service.impl;

import com.dohko.order.entity.Stock;
import com.dohko.order.mapper.StockMapper;
import com.dohko.order.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StockServiceImpl implements StockService {

    @Autowired
    private StockMapper stockMapper;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean deduct(String commodityCode, int num) {
        Stock stock = new Stock();
        stock.setCommodityCode(commodityCode);
        stock.setNum(num);
        int affectedRows = stockMapper.deduct(stock);
        return affectedRows > 0 ? true : false;
    }

}
