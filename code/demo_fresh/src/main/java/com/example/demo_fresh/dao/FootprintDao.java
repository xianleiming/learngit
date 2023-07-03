package com.example.demo_fresh.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo_fresh.bean.Footprint;
import org.springframework.stereotype.Repository;

@Repository
public interface FootprintDao extends BaseMapper<Footprint> {
    boolean addFootprint(Footprint footprint);
}
