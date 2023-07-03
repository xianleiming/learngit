package com.example.demo_fresh.service.impl;




import com.example.demo_fresh.bean.OrderGoods;
import com.example.demo_fresh.dao.OrderGoodsDao;
import com.example.demo_fresh.service.OrderGoodsService;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Connection;
import java.util.List;

public class OrderGoodsServiceImpl implements OrderGoodsService {

    @Autowired
    private OrderGoodsDao orderGoodsDao;

    /**
     * 添加订单商品项
     * @param conn
     * @param orderGoods
     * @return
     */
    @Override
    public boolean addOrderGoods(Connection conn, OrderGoods orderGoods) {
        return  orderGoodsDao.updateById(orderGoods) > 0? true:false;
    }
}
