// 
// 
// 

package com.iarchie.crm_v1.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
public class WelcomeController
{
    @RequestMapping({ "/hello" })
    public String welcome() {
        return "common/welcome";
    }
    
    @RequestMapping({ "/index" })
    public String index() {
        return "/main.jsp";
    }
}
