package com.example.demo_fresh.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * 首页（也负责各个页面跳转）
 */
@RestController
@RequestMapping("/home")
public class HomeController {

        /*
         * 跳转首页
         *      AJax的做法： 在home页面中写一个ajax获取所有分类数据，写一个CategoryController
         *          查询所有的分类数据，返回json，home页面拿到json数据，通过DOM展示就行。
         */
        @RequestMapping("/index")// 跳转首页
        public String goHome(){
            return "home";
        }
        @RequestMapping("/toLogin")// 跳转登录页面
        private String toLogin(){
            return "login";
        }
        @RequestMapping("/toRegister")// 跳转注册页面
        private String toRegister(){
            return "register";
        }
        @RequestMapping("/toForget")// 跳转忘记密码
        private String toForget(){
            return "forget_password";
        }


}
