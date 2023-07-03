package com.example.demo_fresh.service;


import com.example.demo_fresh.bean.Cart;


import java.sql.Connection;
import java.util.List;

public interface CartService {

    /*添加购物车*/
    boolean addCart(Cart cart);

    /*删除购物车数据*/
    boolean deleteCartByID(Connection conn,long id);

    /*清空购物车（提交了订单）*/
    boolean deleteCart(long uid);

    /*获取所有购物车信息*/
    List<Cart> getCarts(long uid);

    /*更新购物车中商品的数量，type=1是增加1，type=2是减少1*/
    boolean updateCartNums(long id,int type);

    /*根据用户id获取购物车数*/
    long getCounts(long uid);

    Cart getCart(long uid,long gid);
}
