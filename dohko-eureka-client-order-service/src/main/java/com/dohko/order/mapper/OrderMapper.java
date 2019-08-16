package com.dohko.order.mapper;

import com.dohko.order.entity.Order;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Description 订单Mapper
 * @Author luxiaohua
 * @Date 2019/8/16
 */

@Mapper
public interface OrderMapper {

    Order selectById(Long id);

    void insert(Order order);
}
