package com.usian.controller;

import com.usian.pojo.User;
import com.usian.service.UserService;

import net.minidev.json.JSONObject;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/findpage")
    public String test(Model model){
       List<User> list = userService.fiandpage();
        model.addAttribute("list",list);
        return "user";
    }

    @RequestMapping("/add")
    @ResponseBody
    public  JSONObject add(@Param(value = "zhanghao")String zhanghao){
        userService.add(zhanghao);
        JSONObject result = new JSONObject();
        result.put("success", true);
        result.put("msg", "添加成功");
        return result;
    }

  @RequestMapping("/tiaoadd")
  public  String tiaoadd(){


        return "add";
    }





}
