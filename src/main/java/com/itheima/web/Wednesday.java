package com.itheima.web;

import com.itheima.domain.Account;
import com.itheima.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("user")
public class Wednesday {

    @Autowired
    private AccountService service;

    @RequestMapping("hello")
    public String test(){

        System.out.println("执行了");
        List<Account> all = service.findAll();
        System.out.println(all);

        return "success";
    }
}
