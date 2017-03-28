package cn.leiyy.lalazhaopin.appserver.controller;

import cn.leiyy.lalazhaopin.appserver.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by hanlin.huang on 2017/3/28.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/hello")
    @ResponseBody
    public Map<String,Object> sayHello(){
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("hello","world");
        return map;
    }


}
