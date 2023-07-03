package com.example.demo_fresh.dao;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo_fresh.bean.User;
import org.springframework.stereotype.Repository;

/**
 * 用户表操作
 */

@DS("master")// 切换数据源
@Repository
public interface UserDao extends BaseMapper<User> {



}
