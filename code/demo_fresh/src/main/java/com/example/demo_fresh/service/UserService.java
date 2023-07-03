package com.example.demo_fresh.service;

import com.example.demo_fresh.bean.User;

/**
 * 用户服务类
 */
public interface UserService {

    User login(String uname, String password);// 登录

    boolean register(User user);// 注册

    boolean forgetPwd(String email, String newPwd);// 忘记密码

    boolean updateIcon(long uid,String icon);// 更新头像

}
