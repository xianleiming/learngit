package com.example.demo_fresh.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo_fresh.bean.Slide;
import com.example.demo_fresh.bean.User;
import com.example.demo_fresh.dao.SlideDao;
import com.example.demo_fresh.service.SlideService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SlideServiceImpl implements SlideService {

    @Autowired
    SlideDao slideDao;
    private static QueryWrapper<Slide> queryWrapper = new QueryWrapper<>();


    @Override
    public List<Slide> getSlides(int type) {
        queryWrapper.eq("type",type);
        return slideDao.selectList(queryWrapper);
    }
}
