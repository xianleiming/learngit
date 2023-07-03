package com.example.demo_fresh.controller;


import com.example.demo_fresh.service.UserService;
import com.example.demo_fresh.service.impl.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.util.List;

/**
 * UserController是一个控制器类，用于处理与用户相关的请求。
 * 该类继承自BaseController，并通过@WebServlet注解将URL映射为"/user/*"。
 * 在处理请求时，根据请求的URI执行相应的操作，包括登录、注册、发送验证码、忘记密码、注销、
 * 查看用户信息、查看订单、查看用户地址、上传文件和获取用户浏览记录。
 * 该类依赖于UserService和GoodsService接口的实现类，并通过实例化相应的服务类来调用业务逻辑。
 */

@RestController
@RequestMapping("/user")
public class UserController {

    private UserService userService = new UserServiceImpl();

    @RequestMapping("/login")// 登录操作
    private String toLogin(){
        return "login";
    }
    @RequestMapping("/register")// 注册操作
    private String toRegister(){
        return "register";
    }
//
//        if (uri.equals("/user/sendCode")){// 发送验证码
//            sendCode();
//        }
//        if (uri.equals("/user/forget")){// 忘记密码
//            forget();
//
//        }
//        if (uri.equals("/user/logout")){// 注销登录
//            logout();
//        }
//        if (uri.equals("/user/info")) {// 用户中心
//            forwardJSP("user/user_center_info");
//        }
//        if (uri.equals("/user/order")) {// 全部订单
//            forward("/order/my");
//        }
//        if (uri.equals("/user/site")) {// 收货地址
//            forwardJSP("user/user_center_site");
//        }
//        if (uri.equals("/user/upload")) {// 头像上传
//            upload();
//        }
//        if (uri.equals("/user/footprints")) {// 最近浏览
//            FUser fUser = (FUser) req.getSession().getAttribute("user");
//            List<FGoods> goodsList = goodsService.getGoodsByUid(fUser.getUid());
//            BaseResult result = new BaseResult(200,"获取成功", goodsList);
//           resp.getWriter().println(JSON.toJSONString(result));
//        }
//
//
//    private void upload() throws IOException {
//        UploadUtils.upload(req, resp);
//        FUser user = (FUser) req.getSession().getAttribute("user");
//        userService.updateIcon(user.getUid(), "/upload/" + UploadUtils.fileName);// 头像的相对路径地址存入数据库
//
//        user.setIcon("/upload/" + UploadUtils.fileName);
//        req.getSession().setAttribute("user", user);
//
//    }
//
//    private void logout() throws IOException {
//        req.getSession().invalidate();
//        resp.sendRedirect("/home/index");
//    }
//
//    private void forget() throws IOException {
//        String email = req.getParameter("email");
//        String code = req.getParameter("code");
//        BaseResult result = null;
//        if (code.equals("")){
//            result = new BaseResult(1001,"请输入验证码");
//        }else if(code.equals(req.getSession().getAttribute("code"))){
//            //验证码正确就可以修改了
//            String newPwd = req.getParameter("newPwd");
//            boolean b = userService.forgetPwd(email, newPwd);
//            if (b){
//                result = new BaseResult(200,"修改密码成功！");
//            }else{
//                result = new BaseResult(1002,"修改密码失败！");
//            }
//        }else{
//            result = new BaseResult(1003,"验证码错误");
//        }
//        resp.getWriter().println(JSON.toJSONString(result));
//    }
//
//
//    private void sendCode() throws IOException {
//        String email = req.getParameter("email");
//        String code = EmailUtils.getCode();
//        //把code放入到session中，用于验证
//        req.getSession().setAttribute("code",code);
//        boolean b = EmailUtils.sendEmail(email, "找回密码", "验证码为："
//                + code + ",请妥善保管，切勿泄露！");
//        BaseResult result = null;
//        if (b){//发送成功！
//            result = new BaseResult(200,"发送验证码成功，请注意查收");
//        }else{
//            result = new BaseResult(1000,"发送失败，请稍后重试！");
//        }
//        resp.getWriter().println(JSON.toJSONString(result));
//    }
//
//    private void login() throws IOException, ServletException {
//        String uname = req.getParameter("uname");
//        String upassword = req.getParameter("upassword");
//        FUser user = userService.login(uname, upassword);
//        if (user != null){
//            //把登录的用户信息放入到session中
//            req.getSession().setAttribute("user",user);
//            resp.sendRedirect("/home/index");
//        }else{
//            req.setAttribute("msg","账号或密码不正确！");
//            forwardJSP("login");
//        }
//    }
//    private void register() throws ServletException, IOException {
//        String uname = req.getParameter("uname");
//        String upassword = req.getParameter("upassword");
//        String phone = req.getParameter("phone");
//        String email = req.getParameter("email");
//        FUser user = new FUser(uname,upassword,email,phone);
//
//        boolean flag = userService.register(user);
//        if (flag){
//            req.setAttribute("msg","注册成功！");
//        }else{
//            req.setAttribute("msg","注册失败！");
//        }
//        forward("/home/toRegister");
//    }
}


