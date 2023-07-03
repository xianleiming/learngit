package com.example.demo_fresh.dao;


import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo_fresh.bean.OrderGoods;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.util.List;

@DS("master")// 切换数据源
@Repository
public interface OrderGoodsDao extends BaseMapper<OrderGoods> {

}
