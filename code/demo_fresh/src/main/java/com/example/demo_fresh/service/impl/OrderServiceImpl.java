package com.example.demo_fresh.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo_fresh.bean.Order;
import com.example.demo_fresh.bean.OrderGoods;
import com.example.demo_fresh.dao.OrderDao;
import com.example.demo_fresh.dao.OrderGoodsDao;
import com.example.demo_fresh.dao.SlideDao;
import com.example.demo_fresh.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Connection;
import java.util.List;

public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;
    private static QueryWrapper<Order> queryWrapper = new QueryWrapper<>();

    /**
     * 添加订单
     * @param conn
     * @param order
     * @return
     */
    @Override
    public long addOrder(Connection conn, Order order) {
        return orderDao.insert(order);
    }

    @Override
    public List<Order> getOrders(long uid) {
        //先获取用户的所有订单
        queryWrapper.eq("userId",uid);
        List<Order> orders = orderDao.selectList(queryWrapper);
        return orders;
    }
}
