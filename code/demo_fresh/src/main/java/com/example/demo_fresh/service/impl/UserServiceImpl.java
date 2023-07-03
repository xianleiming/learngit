package com.example.demo_fresh.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo_fresh.bean.User;
import com.example.demo_fresh.dao.UserDao;
import com.example.demo_fresh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;
    private static QueryWrapper<User> queryWrapper = new QueryWrapper<>();

    /**
     * 登录
     * @param uname
     * @param password
     * @return
     */
    @Override
    public User login(String uname, String password) {
        Map<String,Object> map = new HashMap<>();
        map.put("uname",uname);
        map.put("upassword",password);
        queryWrapper.allEq(map);
        User user = userDao.selectOne(queryWrapper);
        return user;
    }

    /**
     * 注册
     * @param user
     * @return
     */
    @Override
    public boolean register(User user) {
        queryWrapper.eq("uname",user.getUname());
        //先查找注册的账号是否已经注册
        if ( userDao.selectOne(queryWrapper) == null) {
            return userDao.insert(user) == 1 ? true:false;
        }else{//没有已经可被……注册的
            return false;
        }
    }

    /**
     * 根据邮箱修改密码
     * @param email
     * @param newPwd
     * @return
     */
    @Override
    public boolean forgetPwd(String email, String newPwd) {
        queryWrapper.eq("email",email);
        User user = userDao.selectOne(queryWrapper);
        user.setUpassword(newPwd);
        return userDao.updateById(user) == 1 ? true:false;
    }

    /**
     * 更新头像
     * @param uid
     * @param icon
     * @return
     */
    @Override
    public boolean updateIcon(long uid, String icon) {
        User user = userDao.selectById(uid);
        user.setIcon(icon);
        return userDao.updateById(user) == 1 ? true:false;
    }

}
