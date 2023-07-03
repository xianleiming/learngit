package com.example.demo_fresh.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo_fresh.bean.Goods;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface GoodsDao extends BaseMapper<Goods> {
    List<Goods> getGoods(long cid);

    /*搜索商品*/
    List<Goods> getGoods(String keywords, Integer pageSize, Integer pageNum);
    List<Goods> getGoods(String keywords);

    /*计数*/
    long count(String keywords);

    /**
     * 搜索商品-排序
     * @param keywords
     * @param sortWord  排序字段
     * @param sort  升降序
     * @return
     */
    List<Goods> getGoods2(String keywords, String sortWord, String sort);

    Goods getGoodsByID(String gid);

    List<Goods> getNewGoods();

    List<Goods> getGoodsByUid(long uid);


}
