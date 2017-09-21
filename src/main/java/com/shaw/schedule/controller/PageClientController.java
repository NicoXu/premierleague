package com.shaw.schedule.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by shaw on 2017/7/18.
 */
@Controller
@RequestMapping(value = "/premierleague")
public class PageClientController {

    @RequestMapping(value = "/toIndex")
    public String toIndex(){
        return "index";
    }

    @RequestMapping(value = "/score")
    public String toScore(){
        return "score";
    }

    @RequestMapping(value = "/index")
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/login")
    public String toLogin(){
        return "login";
    }
}
