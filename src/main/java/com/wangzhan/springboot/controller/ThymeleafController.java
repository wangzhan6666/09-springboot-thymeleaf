package com.wangzhan.springboot.controller;


import com.wangzhan.springboot.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

@Controller
public class ThymeleafController {

    @RequestMapping("/boot/index")
    public String index(Model model){

        User user =new User();
        user.setId(1);
        user.setNick("昵称");
        user.setPhone("15920333144");
        user.setEmail("2774891137@qq.com");
        user.setAddress("夜空中最亮的星");
        model.addAttribute("user",user);

        //springboot集成Thymeleaf模块例子——start
        model.addAttribute("msg","spring Boot 集成Thymeleaf.");
        //springboot集成Thymeleaf模块例子——end

        //return中就是你页面的名字(不带.html后缀)
        return "index";
    }

    @RequestMapping("/boot/parameters")
    public String parameters(Model model){


        List<User> userList = new ArrayList<>();
        Map<String,Object> userMap = new HashMap<>();
        User[] userArray = new User[3];
        for (int i=0;i<3;i++){
            User user =new User();
            user.setId(1);
            user.setNick("昵称");
            user.setPhone("15920333144");
            user.setEmail("2774891137@qq.com");
            user.setAddress("夜空中最亮的星");
            model.addAttribute("user",user);

            userList.add(user);
            userMap.put(String.valueOf(i),user);
            userArray[i] = user;
        }
        model.addAttribute("userList",userList);
        model.addAttribute("userMap",userMap);
        model.addAttribute("userArray",userArray);
        model.addAttribute("username","wangzhan");
        model.addAttribute("sex","1");


        return "parameters";
    }


    @RequestMapping("/boot/literal")
    public String literal(Model model, HttpServletRequest request){
        User user =new User();
        user.setId(1);
        user.setNick("昵称");
        user.setPhone("15920333144");
        user.setEmail("2774891137@qq.com");
        user.setAddress("夜空中最亮的星");
        model.addAttribute("user",user);
        model.addAttribute("isFlag",true);
        model.addAttribute("sex","2");


        request.setAttribute("name", "www.wangzhan.com");
        request.getSession().setAttribute("address","夜空中最亮的星");

        model.addAttribute("date",new Date());


        return "literal";
    }




}
