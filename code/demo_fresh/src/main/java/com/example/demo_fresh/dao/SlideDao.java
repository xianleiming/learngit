package com.example.demo_fresh.dao;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo_fresh.bean.Slide;
import org.springframework.stereotype.Repository;


@DS("master")// 切换数据源
@Repository
public interface SlideDao extends BaseMapper<Slide> {

}
