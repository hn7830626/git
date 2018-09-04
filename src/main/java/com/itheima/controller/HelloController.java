package com.itheima.controller;

import com.itheima.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class HelloController {
    public HelloController(){
        System.out.println("创建HelloController");
    }
    @RequestMapping(value = "/hello.do")
    public String save(User user){
        System.out.println(user);
        System.out.println(user.getBirthday());
        System.out.println("控制器处理请求");
        return "/pages/success.jsp";
    }
    @RequestMapping(value = "/body.do")
    public String requestBody(@RequestBody String requestData ){
        System.out.println(requestData);
        System.out.println("控制器处理请求");
        return "/pages/success.jsp";
    }

}
