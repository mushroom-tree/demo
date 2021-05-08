package com.three.demo.rest;

import com.three.demo.entity.User;
import com.three.demo.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @version
 * @describe:控制器
 */
@Controller  //注解为控制器
@RequestMapping(value="/login")    //截获带有/login的请求
public class LoginController {

    @Autowired
    LoginService loginService;


    @RequestMapping(method=RequestMethod.GET)
//    @ResponseBody
    public String get(){  //用来返回一个页面
        System.out.print("登录");
        return "login";  //返回指向login.jsp页面
    }

    @RequestMapping(method=RequestMethod.POST)
    public String post(User user){  //用来处理用户的登陆请求
        int result = loginService.login(user.getUserName(),user.getPassword());
        if(1==result){
            return "login_success";
        }
        return "login";

    }
}
