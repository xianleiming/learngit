package com.example.demo_fresh.service;


import com.example.demo_fresh.bean.OrderGoods;


import java.sql.Connection;

public interface OrderGoodsService {

    /*添加订单商品项*/
    boolean addOrderGoods(Connection conn, OrderGoods orderGoods);
}
