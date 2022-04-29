package com.foxmo.controller;

import com.foxmo.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ControllerParamTest {
    @RequestMapping("/hello1")
    public String test1(@RequestParam("name") String name, Model model){
        String msg = "接受到的Get请求参数为：" + name;
        model.addAttribute("msg",msg);
        return "success";
    }

    @PostMapping("/hello2")
    public String test2(@RequestParam("username") String name, Model model){
        String msg = "接受到的Post请求参数为：" + name;
        model.addAttribute("msg",msg);
        return "success";
    }

    @GetMapping("/hello3")
    public String test3(User user, Model model){
        String msg = "接收到的请求参数为：" + user.toString();
        model.addAttribute("msg",msg);
        return "success";
    }


}
