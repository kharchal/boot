package com.example.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * Created by Sunny on 02.02.2017.
 */
@Controller
//@EnableAutoConfiguration
@RequestMapping("/")
public class IndexController {

    @RequestMapping("/")
    @ResponseBody
    public String index() {
        return "qwerty";
    }

    @RequestMapping("/abc")
    public String abc(Model model) {
        System.out.println("abc mapping");
        model.addAttribute("msg", new Date());
        return "index";
    }
}
