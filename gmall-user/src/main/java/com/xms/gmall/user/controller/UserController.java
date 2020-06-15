package com.xms.gmall.user.controller;

import com.xms.gmall.user.bean.UmsMenber;
import com.xms.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/hello")
public class UserController {
    @Autowired
    UserService service;

    @RequestMapping("/hellos")
    @ResponseBody
    public String hello(){
        return "你好啊";
    }
    @RequestMapping("/getAll")
    @ResponseBody
    public String getAll(){
       List<UmsMenber> um =  service.getAll();
       if(um.size()>0){
           return "我爱你";
       }else{
           return "null";
       }
    }
}
