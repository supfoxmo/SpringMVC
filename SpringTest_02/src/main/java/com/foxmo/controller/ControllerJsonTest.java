package com.foxmo.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.foxmo.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.SimpleFormatter;

@Controller
public class ControllerJsonTest {
    @RequestMapping(value="t1")
    @ResponseBody  //表示该方法不会走视图解析器，会直接返回一个字符串
    public String test1() throws JsonProcessingException {
        //创建一个User对象
        User user1 = new User(1001, "王海波", 22);

        ObjectMapper mapper = new ObjectMapper();
        //将user1对象转化成具有JSON格式的字符串
        String msg = mapper.writeValueAsString(user1);//{"id":1001,"name":"zhangsan","age":22}
        //直接返回字符串给前端
        return msg;
    }

    @RequestMapping(value="t2")
    @ResponseBody  //表示该方法不会走视图解析器，会直接返回一个字符串
    public String test2() throws JsonProcessingException {
        //创建一个User类容器
        ArrayList<User> users = new ArrayList<>();
        //创建User对象
        User user1 = new User(1001, "王海波", 22);
        User user2 = new User(1002, "刘俊涛", 19);
        User user3 = new User(1003, "李晓明", 38);
        User user4 = new User(1004, "周伊妮", 26);
        User user5 = new User(1005, "张三丰", 57);

        //将User对象存储到List容器中
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);

        ObjectMapper mapper = new ObjectMapper();
        //将user1对象转化成具有JSON格式的字符串
        String msg = mapper.writeValueAsString(users);
        //直接返回字符串给前端
        return msg;
    }

    /**
     *
     * @return 当前系统时间
     * @throws JsonProcessingException
     */
    @RequestMapping(value="t3")
    @ResponseBody  //表示该方法不会走视图解析器，会直接返回一个字符串
    public String test3() throws JsonProcessingException {
        //创建一个Date对象
        Date date = new Date();
        System.out.println("当前系统时间为：" + date);
        //自定义日期格式
        SimpleDateFormat format = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
        //将系统时间转化成自定义格式
        String personDate = format.format(date);
        System.out.println(personDate);

        ObjectMapper mapper = new ObjectMapper();
        //将user1对象转化成具有JSON格式的字符串
        String msg = mapper.writeValueAsString(personDate);
        //直接返回字符串给前端
        return msg;
    }
}
