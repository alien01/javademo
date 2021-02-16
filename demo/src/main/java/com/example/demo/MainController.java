package com.example.demo;

import com.example.demo.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @GetMapping("userInfo")
    @ResponseBody
    public User userInfo(Integer id){
        return new User().
                setId(id).
                setAge(25).
                setName("张三");
    }

    @GetMapping("/index")
    public String index(){
        return "index";
    }
}
