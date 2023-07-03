package com.example.demo_fresh.dao;


import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo_fresh.bean.Order;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.util.List;

/**
 * 订单表的操作
 */

@DS("master")// 切换数据源
@Repository
public interface OrderDao extends BaseMapper<Order> {


}
