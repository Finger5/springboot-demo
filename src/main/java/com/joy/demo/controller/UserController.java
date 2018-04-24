package com.joy.demo.controller;

import com.joy.demo.pojo.Resource;
import com.joy.demo.pojo.User;
import com.joy.demo.util.JsonResult;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;


/**
 * Created by Administrator on 2018-04-14.
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private  Resource resource;

    @RequestMapping("/getResources")
    public JsonResult getResources(){
        Resource bean= new Resource();
        BeanUtils.copyProperties(resource,bean);
        return JsonResult.ok(bean);
    }

    @RequestMapping("/gerUser")
    public Object getUser(){
        User user =new User();
        user.setAge(11);
        user.setBirthday(new Date());
        user.setName("名字");
        return user;
    }
}
