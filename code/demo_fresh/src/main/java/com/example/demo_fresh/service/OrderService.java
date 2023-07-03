package com.example.demo_fresh.service;


import com.example.demo_fresh.bean.Order;

import java.sql.Connection;
import java.util.List;

public interface OrderService {

    /*添加订单*/
    long addOrder(Connection conn, Order order);

    /*获取用户所有订单*/
    List<Order> getOrders(long uid);

}
