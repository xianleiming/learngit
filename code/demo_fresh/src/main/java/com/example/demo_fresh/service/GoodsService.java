package com.example.demo_fresh.service;

import com.example.demo_fresh.bean.Goods;


import java.util.List;

public interface GoodsService {
    List<Goods> getGoods(Long cid);

    List<Goods> search(String keyword,Integer pageSize,Integer pageNum);
    List<Goods> search(String keyword);

    long count(String keyword);

    List<Goods> search2(String keyword, String sortWord, String sort);

    Goods getGoodsByID(String gid);

    List<Goods> getNewGoods();

    List<Goods> getGoodsByUid(long uid);

}
