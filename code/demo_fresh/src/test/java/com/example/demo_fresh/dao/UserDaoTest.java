package com.example.demo_fresh.dao;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo_fresh.bean.User;
import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@Log4j2
class UserDaoTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
//        User user = userDao.selectById(17);
//        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
//        QueryWrapper<User> QueryWrapper = queryWrapper.eq("uname", "admin");
//        User user = userDao.selectOne(QueryWrapper);
//        System.out.println(user);

        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<>();
        LambdaQueryWrapper<User> lambdaQueryWrapper = wrapper.eq(User::getUname, "admin");
        User user = userDao.selectOne(lambdaQueryWrapper);
        System.out.println(user);
    }
}