package com.dohko.order.service;

public interface StockService {

    boolean deduct(String commodityCode, int num);

}
