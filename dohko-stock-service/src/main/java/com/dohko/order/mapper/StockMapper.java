package com.dohko.order.mapper;

import com.dohko.order.entity.Stock;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StockMapper {

    /**
     * 扣减库存
     * @param stock
     * @return
     */
    int deduct(Stock stock);

    Stock selectByCommodityCode(String commodityCode);
}
