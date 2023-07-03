package com.example.demo_fresh.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo_fresh.bean.Address;
import org.springframework.stereotype.Repository;

/**
 * 收货地址：
 *      第一代码实现，如果存在就更新，不存在就添加
 *      第二写一个存储过程（课下可以尝试）：
 */
@Repository
public interface AddressDao extends BaseMapper<Address> {

    /*添加和编辑*/
    boolean updateAddress(Address address);

    /*根据用户id获取地址*/
    Address get(long uid);

}
