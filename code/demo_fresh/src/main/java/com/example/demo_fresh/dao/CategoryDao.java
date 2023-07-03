package com.example.demo_fresh.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo_fresh.bean.Category;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CategoryDao extends BaseMapper<Category> {

    //获取所有分类
    List<Category> getAllCategories();

}
