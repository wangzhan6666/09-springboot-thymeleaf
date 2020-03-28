package com.wangzhan.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



/*
* 目的：springboot集成Thymeleaf模块
* 步骤：第一步：创建项目时，要同时选择web、thymeleaf(%%特别注意%%)
*      第二步：第一步创建了，就不用在pom.xml文件中引入Thymeleaf依赖了,依赖配置如下：
                 <!--springboot继承Thymeleaf的起步依赖-->
                 <dependency>
                     <groupId>org.springframework.boot</groupId>
                     <artifactId>spring-boot-starter-thymeleaf</artifactId>
                 </dependency>
*       第三步：在spring boot的核心配置文件application.properties中对Thymeleaf进行配置：
                 #开发阶段，建议关闭模板thymeleaf的缓存
                 spring.thymeleaf.cache=false
                 #使用遗留的html5标签的校验
                 spring.thymeleaf.mode=LEGACYHTML5
*       第四步：写一个Controller去映射到模板页面(和SpringMVC基本一致),比如：
*                @RequestMapping("/boot/index")
                 public String index(Model model){
                     model.addAttribute("msg","spring Boot 集成Thymeleaf.");
                     //return中就是你页面的名字(不带.html后缀)
                     return "index";
                 }
*       第五步：在src/main/resources的templates下新建一个index.html页面用于展示数据：
*              HTML页面的<html>元素中加入以下属性：<html xmlns:th="http://www.thymeleaf.org">
*
* */


@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
