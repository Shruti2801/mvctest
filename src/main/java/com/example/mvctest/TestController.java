package com.example.mvctest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
    public class TestController {

        @RequestMapping("/")
        public String test() {
            return "test";
        }

        @RequestMapping(value = "/course", method = RequestMethod.GET)
        public @ResponseBody
        String printDetails(@RequestParam("name") String name, ModelMap m){

        // add attribute to load modelMap
//        m.addAttribute("message",
//                "Hello World and Welcome to Spring MVC!");
//        m.addAttribute("CourseName","Spring");
        // return the name of the file to be loaded "hello_world.jsp"
        return "Hello "
                + name;
    }

}

//    String CourseName, int CourseId, String CourseDur,