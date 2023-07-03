package com.example.demo_fresh.service;


import com.example.demo_fresh.bean.Address;


public interface AddressService {

    /*添加和编辑*/
    boolean updateAddress(Address address);

    /*根据用户id获取地址*/
    Address get(long uid);
}
