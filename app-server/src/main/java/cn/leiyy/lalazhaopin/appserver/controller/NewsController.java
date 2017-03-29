package cn.leiyy.lalazhaopin.appserver.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by hanlin.huang on 2017/3/29.
 */

@Controller
@RequestMapping("/news")
public class NewsController {

    @RequestMapping("/list")
    @ResponseBody
    public List<Map<String,Object>> sayHello(){
        List list = new ArrayList();
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("hello","world");
        list.add(map);
        return list;
    }
}
